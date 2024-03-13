package checkpoint;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
	
	ServiceRegistration checkpointPublisherRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		Checkpoint checkpoint = new CheckpointImpl();
		checkpointPublisherRegistration = bundleContext.registerService(Checkpoint.class.getName(), checkpoint, null);
		System.out.println("Starting checkpoint publisher");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stoped checkpoint publisher");
		checkpointPublisherRegistration.unregister();
	}

}
