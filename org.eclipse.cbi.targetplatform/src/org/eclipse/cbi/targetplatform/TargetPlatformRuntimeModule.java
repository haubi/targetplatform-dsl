/*******************************************************************************
 * Copyright (c) 2012-2014 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mikael Barbero (Obeo) - initial API and implementation
 *******************************************************************************/
package org.eclipse.cbi.targetplatform;

import org.eclipse.cbi.targetplatform.conversion.TargetPlatformIDValueConverter;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter;

import com.google.inject.Provider;

import org.eclipse.cbi.targetplatform.conversion.TargetPlatformConverter;
import org.eclipse.cbi.targetplatform.util.LocationIndexBuilder;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class TargetPlatformRuntimeModule extends org.eclipse.cbi.targetplatform.AbstractTargetPlatformRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return TargetPlatformConverter.class;
	}
	
	public Class<? extends AbstractIDValueConverter> bindAbstractIDValueConverter() {
		return TargetPlatformIDValueConverter.class;
	}
	
	public Class<? extends LocationIndexBuilder> bindLocationIndexBuilder() {
		return LocationIndexBuilder.class;
	}
	
	public Provider<IProvisioningAgent> provideIProvisioningAgent() {
		return new Provider<IProvisioningAgent>() {
			public IProvisioningAgent get() {
				return TargetPlatformBundleActivator.getInstance().getProvisioningAgent();
			}
		};
	}
}
