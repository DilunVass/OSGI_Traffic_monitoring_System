package camera;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
	private void CallInterface() {
		Camera cam = new CameraImpl();
		context.registerService(Camera.class, cam, null);
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Camera service started......");
		this.CallInterface();
		System.out.println("Welcome to camara system...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Camera service system off...");
	}

}
