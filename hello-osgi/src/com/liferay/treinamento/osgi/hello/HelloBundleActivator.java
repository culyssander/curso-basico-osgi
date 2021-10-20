package com.liferay.treinamento.osgi.hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloBundleActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Ola mundo!!");
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Adeus mundo!!");
	}

}
