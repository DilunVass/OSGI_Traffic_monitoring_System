package trafficreport;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration trafficReportPublisherRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		TrafficReportImpl trafficReport = new TrafficReportImpl();
		trafficReportPublisherRegistration = bundleContext.registerService(TrafficReportImpl.class.getName(), trafficReport, null);
		System.out.println("Starting traffic report publisher");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stoped traffic report publisher");
		trafficReportPublisherRegistration.unregister();
	}
}
