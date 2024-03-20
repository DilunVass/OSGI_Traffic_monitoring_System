package motionsensors;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	
	ServiceRegistration MSServiceRegistration;
	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
//	private void CallInterface() {
//		motionSensors ms = new motionSensorImpl();
//		context.registerService(motionSensors.class, ms, null);
//	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Motion sensor service started...");
		//this.CallInterface();
		motionSensors MSService = new motionSensorImpl();
		MSServiceRegistration = bundleContext.registerService(motionSensors.class.getName(), MSService, null);
		System.out.println("Welcom to motion sensor service...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		MSServiceRegistration.unregister();
		System.out.println("Sensor service system off...");
	}

}
