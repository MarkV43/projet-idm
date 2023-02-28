/*
 * generated by Xtext 2.29.0
 */
package fr.n7.ui;

import com.google.inject.Injector;
import fr.n7.pdl1.ui.internal.Pdl1Activator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class PDL1ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Pdl1Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Pdl1Activator activator = Pdl1Activator.getInstance();
		return activator != null ? activator.getInjector(Pdl1Activator.FR_N7_PDL1) : null;
	}

}
