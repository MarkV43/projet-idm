/*
 * generated by Xtext 2.29.0
 */
package fr.n7.serializer;

import com.google.inject.Inject;
import fr.n7.pDL1.Guidance;
import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.WorkDefinition;
import fr.n7.pDL1.WorkSequence;
import fr.n7.services.PDL1GrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PDL1SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PDL1GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == PDL1Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case PDL1Package.GUIDANCE:
				sequence_Guidance(context, (Guidance) semanticObject); 
				return; 
			case PDL1Package.PROCESS:
				sequence_Process(context, (fr.n7.pDL1.Process) semanticObject); 
				return; 
			case PDL1Package.WORK_DEFINITION:
				sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
				return; 
			case PDL1Package.WORK_SEQUENCE:
				sequence_WorkSequence(context, (WorkSequence) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns Guidance
	 *     Guidance returns Guidance
	 *
	 * Constraint:
	 *     text=STRING
	 * </pre>
	 */
	protected void sequence_Guidance(ISerializationContext context, Guidance semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDL1Package.Literals.GUIDANCE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.GUIDANCE__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (name=ID processElements+=ProcessElement*)
	 * </pre>
	 */
	protected void sequence_Process(ISerializationContext context, fr.n7.pDL1.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns WorkDefinition
	 *     WorkDefinition returns WorkDefinition
	 *
	 * Constraint:
	 *     name=ID
	 * </pre>
	 */
	protected void sequence_WorkDefinition(ISerializationContext context, WorkDefinition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_DEFINITION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns WorkSequence
	 *     WorkSequence returns WorkSequence
	 *
	 * Constraint:
	 *     (predecessor=[WorkDefinition|ID] linkType=WorkSequenceType successor=[WorkDefinition|ID])
	 * </pre>
	 */
	protected void sequence_WorkSequence(ISerializationContext context, WorkSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__PREDECESSOR));
			if (transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__LINK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__LINK_TYPE));
			if (transientValues.isValueTransient(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL1Package.Literals.WORK_SEQUENCE__SUCCESSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(PDL1Package.Literals.WORK_SEQUENCE__PREDECESSOR, false));
		feeder.accept(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_2_0(), semanticObject.getLinkType());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(PDL1Package.Literals.WORK_SEQUENCE__SUCCESSOR, false));
		feeder.finish();
	}
	
	
}
