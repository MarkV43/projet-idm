/*
 * generated by Xtext 2.29.0
 */
package fr.n7.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.PDL2RuntimeModule;
import fr.n7.PDL2StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class PDL2IdeSetup extends PDL2StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new PDL2RuntimeModule(), new PDL2IdeModule()));
	}
	
}
