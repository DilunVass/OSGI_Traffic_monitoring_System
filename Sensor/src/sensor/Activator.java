package sensor;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration sensorServiceRegistration;
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}


//	private void CallInterface() {
//		Sensor sensor = new SensorImpl();
//		context.registerService(Sensor.class, sensor, null);
//	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Sensor service started......");
		//this.CallInterface();
		Sensor sensorService = new SensorImpl();
		sensorServiceRegistration = bundleContext.registerService(Sensor.class.getName(), sensorService, null);
		System.out.println("Welcome to sensor system...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		sensorServiceRegistration.unregister();
		System.out.println("Sensor service system off...");
	}

}
