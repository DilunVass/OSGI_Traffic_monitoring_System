package motionsensors;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
	private void CallInterface() {
		motionSensors ms = new motionSensorImpl();
		context.registerService(motionSensors.class, ms, null);
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Motion sensor service started...");
		this.CallInterface();
		System.out.println("Welcom to motion sensor service...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Sensor service system off...");
	}

}
