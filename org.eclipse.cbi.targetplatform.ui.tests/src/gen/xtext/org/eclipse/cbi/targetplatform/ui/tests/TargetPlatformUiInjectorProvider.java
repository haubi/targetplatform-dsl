/*
 * generated by Xtext 2.11.0
 */
package org.eclipse.cbi.targetplatform.ui.tests;

import com.google.inject.Injector;
import org.eclipse.cbi.targetplatform.ui.internal.TargetplatformActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class TargetPlatformUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return TargetplatformActivator.getInstance().getInjector("org.eclipse.cbi.targetplatform.TargetPlatform");
	}

}