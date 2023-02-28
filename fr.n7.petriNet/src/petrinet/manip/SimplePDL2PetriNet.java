package petrinet.manip;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import petrinet.Arc;
import petrinet.Element;
import petrinet.Network;
import petrinet.PetrinetFactory;
import petrinet.PetrinetPackage;
import petrinet.Place;
import petrinet.ReadArc;
import petrinet.Transition;
import simplepdl.Process;
import simplepdl.ResourceUtilisation;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;

public class SimplePDL2PetriNet {

	public static void main(String[] args) {
		/**
		 * Lecture du fichier SimplePDL
		 */
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		@SuppressWarnings("unused")
		SimplepdlPackage simplepdlInstance = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant Ãªtre ouverte Ã 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource (notre modèle)
		URI simplepdlModelURI = URI.createURI("models/SimplePDL_ToBeTransformed.xmi");
		Resource simplepdlResource = resSet.getResource(simplepdlModelURI, true);
		
		// Récupérer le premier élément du modèle (élément racine)
		Process process = (Process) simplepdlResource.getContents().get(0);
		
		/**
		 * Création du fichier PetriNet
		 */
		// Charger le package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		@SuppressWarnings("unused")
		PetrinetPackage petrinetInstance = PetrinetPackage.eINSTANCE;
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (le modèle)
		ResourceSet petrinetResSet = new ResourceSetImpl();

		// Définir la ressource (le modèle)
		URI petrinetModelURI = URI.createURI("models/PetriNet_Output.xmi");
		Resource petrinetResource = petrinetResSet.createResource(petrinetModelURI);
		
		// La fabrique pour fabriquer les éléments de SimplePDL
	    PetrinetFactory petrinetFactory = PetrinetFactory.eINSTANCE;

		// Créer un élément Process
		Network network = petrinetFactory.createNetwork();
		
		// Ajouter le Process dans le modèle
		petrinetResource.getContents().add(network);
		
		/**
		 * Manipulation de notre instance
		 */
		
		network.setName(process.getName());
		
		Map<String, Element> map = new HashMap<>();

		// Afficher les sous-activités
		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) o;
				
				Place idle = petrinetFactory.createPlace();
				idle.setTokens(1);
				idle.setName(wd.getName() + "_idle");
				map.put(idle.getName(), idle);
				
				Place running = petrinetFactory.createPlace();
				running.setName(wd.getName() + "_running");
				map.put(running.getName(), running);
				
				Place started = petrinetFactory.createPlace();
				started.setName(wd.getName() + "_started");
				map.put(started.getName(), started);
				
				Place finished = petrinetFactory.createPlace();
				finished.setName(wd.getName() + "_finished");
				map.put(finished.getName(), finished);
				
				network.getElements().add(idle);
				network.getElements().add(running);
				network.getElements().add(started);
				network.getElements().add(finished);
				
				Transition start = petrinetFactory.createTransition();
				start.setName(wd.getName() + "_start");
				map.put(start.getName(), start);
				
				Transition finish = petrinetFactory.createTransition();
				finish.setName(wd.getName() + "_finish");
				map.put(finish.getName(), finish);
				
				network.getElements().add(start);
				network.getElements().add(finish);
				
				Arc toStart = petrinetFactory.createArc();
				toStart.setPredecessor(idle);
				toStart.setSuccessor(start);
				
				Arc toStarted = petrinetFactory.createArc();
				toStarted.setPredecessor(start);
				toStarted.setSuccessor(started);
				
				Arc toRunning = petrinetFactory.createArc();
				toRunning.setPredecessor(start);
				toRunning.setSuccessor(running);
				
				Arc toFinish = petrinetFactory.createArc();
				toFinish.setPredecessor(running);
				toFinish.setSuccessor(finish);
				
				Arc fromFinish = petrinetFactory.createArc();
				fromFinish.setPredecessor(finish);
				fromFinish.setSuccessor(finished);
				
				network.getArcs().add(toStart);
				network.getArcs().add(toStarted);
				network.getArcs().add(toRunning);
				network.getArcs().add(toFinish);
				network.getArcs().add(fromFinish);
			}
		}

		for (Object o : process.getProcessElements()) {
			if (o instanceof WorkSequence) {
				WorkSequence ws = (WorkSequence) o;
				
				WorkDefinition pred = ws.getPredecessor();
				WorkDefinition succ = ws.getSuccessor();
				
				WorkSequenceType type = ws.getLinkType();
				
				ReadArc arc = petrinetFactory.createReadArc();
				network.getArcs().add(arc);
				
				switch (type) {
				case FINISH_TO_FINISH:
				case FINISH_TO_START:
					arc.setPredecessor(map.get(pred.getName() + "_finished"));
					break;
				case START_TO_FINISH:
				case START_TO_START:
					arc.setPredecessor(map.get(pred.getName() + "_started"));
					break;
				}
				
				switch (type) {
				case FINISH_TO_FINISH:
				case START_TO_FINISH:
					arc.setSuccessor(map.get(succ.getName() + "_finish"));
					break;
				case FINISH_TO_START:
				case START_TO_START:
					arc.setSuccessor(map.get(succ.getName() + "_start"));
					break;
				}
			}
		}
		
		Map<String, Place> resources = new HashMap<>();
		for (Object o : process.getProcessElements()) {
			if (o instanceof simplepdl.Resource) {
				var res = (simplepdl.Resource) o;
				
				Place place = petrinetFactory.createPlace();
				place.setName(res.getName());
				place.setTokens(res.getAmount());
				
				resources.put(place.getName(), place);
				
				network.getElements().add(place);
			}
		}
		
		for (Object o : process.getProcessElements()) {
			if (o instanceof ResourceUtilisation) {
				var ru = (ResourceUtilisation) o;
				
				simplepdl.Resource res = ru.getResource();
				WorkDefinition wd = ru.getWork();
				
				Arc start = petrinetFactory.createArc();
				start.setWeight(ru.getAmount());
				
				Arc finish = petrinetFactory.createArc();
				finish.setWeight(ru.getAmount());
				
				start.setPredecessor(resources.get(res.getName()));
				start.setSuccessor(map.get(wd.getName() + "_start"));
				
				finish.setPredecessor(map.get(wd.getName() + "_finish"));
				finish.setSuccessor(resources.get(res.getName()));
				
				network.getArcs().add(start);
				network.getArcs().add(finish);
			}
		}
		
		try {
	    	petrinetResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
