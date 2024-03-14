package emergencyservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import emergencyservice.Activator;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	private void CallInterface() {
		EmergencyService emergencyService = new EmergencyServiceImpl();
		context.registerService(EmergencyService.class, emergencyService, null);
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Emergency service started......");
		this.CallInterface();
		System.out.println("Welcome to Emergency Service...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Emergency Service Stopped...");
	}
}
