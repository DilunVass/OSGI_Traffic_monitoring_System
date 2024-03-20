package camera;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration cameraServiceRegistration;

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
//	private void CallInterface() {
//		Camera cam = new CameraImpl();
//		context.registerService(Camera.class, cam, null);
//	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Camera service started......");
		Camera cameraService = new CameraImpl();
		cameraServiceRegistration = bundleContext.registerService(Camera.class.getName(), cameraService, null);
		//this.CallInterface();
		System.out.println("Welcome to camara system...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		cameraServiceRegistration.unregister();
		System.out.println("Camera service system off...");
	}

}
