package policestation;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import checkpoint.Checkpoint;
import trafficreport.TrafficReport;

public class Activator implements BundleActivator {

	ServiceReference checkpointServiceReference;
	ServiceReference trafficReportServiceReference;
	Scanner scanner;
	
	public Activator() {
		this.scanner = new Scanner(System.in);
	}

	public void start(BundleContext bundleContext) throws Exception {
		
		checkpointServiceReference = bundleContext.getServiceReference(Checkpoint.class.getName());
		trafficReportServiceReference = bundleContext.getServiceReference(TrafficReport.class.getName());
		
		this.displayDashboard(bundleContext);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("==========================================================");
		System.out.println("EXIT - POLICE STATION");
		System.out.println("==========================================================\n");
		bundleContext.ungetService(checkpointServiceReference);
		
	}
	
	public void displayDashboard(BundleContext bundleContext){
		Checkpoint checkpoint = (Checkpoint) bundleContext.getService(checkpointServiceReference);
		TrafficReport trafficReport = (TrafficReport) bundleContext.getService(trafficReportServiceReference);
		
		System.out.println("==========================================================");
		System.out.println("POLICE STATION");
		System.out.println("==========================================================\n");
		
		System.out.println("Dashboard");
		
		while(true) {			
			System.out.println("\n\n1). Get Checkpoint Location");
			System.out.println("2). get traffic report");
			System.out.print("Select your option : ");
			short response = this.scanner.nextShort();
			
			if(response == 1) {			
				System.out.println("\n> Location of the checkpoint");
				System.out.println("\t" + checkpoint.getLocation());
			}else if(response == 2) {			
				System.out.println("\n> Traffic report\n");
				System.out.println(trafficReport.getTrafficReport());
			}else {
				System.out.println("Enter valid option!");
			}
		}
	}

}
