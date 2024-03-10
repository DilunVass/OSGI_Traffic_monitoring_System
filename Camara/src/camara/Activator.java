package camara;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}
	
	private void CallInterface() {
		Camara cam = new CamaraImpl();
		context.registerService(Camara.class, cam, null);
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Camara service started......");
		this.CallInterface();
		System.out.println("Welcome to camara system...");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Camara service system off...");
	}

}
