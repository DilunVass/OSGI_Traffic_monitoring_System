package trafficlightsystem;

import motionsensors.motionSensors;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private motionSensors ms;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		String choice = "no";
		Scanner sc = new Scanner(System.in);
		System.out.println("Featching trffic monitoring system...");
		
		ServiceReference serviceMS = context.getServiceReference(motionSensors.class);
		
		if(serviceMS != null) {
			ms = (motionSensors) context.getService(serviceMS);
			
			if(ms != null) {
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("");
				System.out.println("Do you want monitor traffic light system? yes or no");
				System.out.println("");
				choice = sc.next();
				
				if(choice.equals("yes")) {
					this.mainAction();
				}else {
					this.mainAction();
				}
				context.ungetService(serviceMS);
			}else {
				System.out.println("Traffic light Service cannot run.... ");
			}
		}else {
			System.out.println("Traffic light Service cannot be found!");
		}
		
		System.out.println("Traffic light Consumer has stopped");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Traffic light bundle stopped!");
	}
	
	
	private void mainAction() {
		Scanner sc = new Scanner(System.in);
		
		String whileCon = "no";
		
		do {
			ServiceReference serviceMS = context.getServiceReference(motionSensors.class);
			
			if (serviceMS != null) {
				ms = (motionSensors) context.getService(serviceMS);
				
				if(ms != null) {
					TrafficLightSystemImpl.MotionSensorData(ms);
					
					context.ungetService(serviceMS);
				}else {
					System.out.println("MotionSensor bundle cannot run!");
				}
			}else {
				System.out.println("MotionSensor bundle cannot be found....");
			}
			
			System.out.println("----------------------------------------------------");
			System.out.println("Do you want to exit? \n 'yes' for YES \n 'no' for NO");
			System.out.println("");
			whileCon = sc.next();

		}while(whileCon.equals("no"));
	}

}
