package sensor;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}


	private void CallInterface() {
		Sensor sensor = new SensorImpl();
		context.registerService(Sensor.class, sensor, null);
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Sensor service started......");
		this.CallInterface();
		System.out.println("Welcome to sensor system...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Sensor service system off...");
	}

}
