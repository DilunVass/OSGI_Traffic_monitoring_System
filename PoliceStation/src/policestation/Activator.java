package policestation;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import checkpoint.Checkpoint;
import trafficreport.TrafficReportImpl;

public class Activator implements BundleActivator {

	ServiceReference checkpointServiceReference;
	ServiceReference trafficReportServiceReference;
	Scanner scanner;
	
	public Activator() {
		this.scanner = new Scanner(System.in);
	}

	public void start(BundleContext bundleContext) throws Exception {
		
		checkpointServiceReference = bundleContext.getServiceReference(Checkpoint.class.getName());
		trafficReportServiceReference = bundleContext.getServiceReference(TrafficReportImpl.class.getName());
		
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
		TrafficReportImpl trafficReport = (TrafficReportImpl) bundleContext.getService(trafficReportServiceReference);
		
		System.out.println("==========================================================");
		System.out.println("POLICE STATION");
		System.out.println("==========================================================\n");
		
		System.out.println("Dashboard");
		
		short response = 0;
		
		while(response != -99) {			
			System.out.println("\n\n1). Get Checkpoint Location");
			System.out.println("2). get traffic report");
			System.out.print("Select your option : ");
			response = this.scanner.nextShort();
			
			if(response == 1) {			
				System.out.println("\n> Location of the checkpoint");
				System.out.println("\t" + checkpoint.getLocation());
			}else if(response == 2) {
				
				System.out.println("\n\n1). Daily Report");
				System.out.println("2). Weekly Report");
				System.out.print("Select your option : ");
				response = this.scanner.nextShort();
				
				System.out.println("\n> Traffic report\n");
				System.out.println(trafficReport.displayTrafficReport(response));
			}else if(response != -99) {
				System.out.println("Enter valid option!");
			}
		}
	}

}
