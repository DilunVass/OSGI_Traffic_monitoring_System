package trafficguard;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import sensor.Sensor;
import camara.Camara;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private Camara camara;
	private Sensor sensor;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Fetching traffic monitoring system...");
		Scanner sc = new Scanner(System.in);
		String choice = "no";
		
		ServiceReference serviceCam = context.getServiceReference(Camara.class);
		ServiceReference serviceSensor = context.getServiceReference(Sensor.class);
		if(serviceCam != null && serviceSensor != null) {
			camara = (Camara) context.getService(serviceCam);
			sensor = (Sensor) context.getService(serviceSensor);
			
			if(camara != null && sensor != null) {
				
				System.out.println("");
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("");
				System.out.println("Do you want traffic monitoring system? yes or no");
				System.out.println("");
				choice = sc.next();
				
				if(choice.equals("yes")) {
					this.mainAction();
				}else {
					this.mainAction();
				}
				context.ungetService(serviceCam);
				context.ungetService(serviceSensor);
//				
			}else {
				System.out.println("Traffic monotoring Service cannot run.... ");
			}
			
		}else {
			System.out.println("Traffic monotoring Service cannot be found!");
		}
		
		System.out.println("TrafficGuard Consumer has stopped");
	}
	
	
	private void mainAction() {
		Scanner sc = new Scanner(System.in);
		
		String whileCon = "no";
		do {
			int s = TrafficGuardImpl.Select();
			
			if(s == 1) {
				ServiceReference serviceCam = context.getServiceReference(Camara.class);
				if(serviceCam != null) {
					camara = (Camara) context.getService(serviceCam);
					
					if(camara != null) {
						TrafficGuardImpl.Cam(camara);
						context.ungetService(serviceCam);
					}else {
						System.out.println("TrafficGuard bundle cannot run!");
					}
				}else {
					System.out.println("TrafficGuard bundle cannot be found....");
				}
			}else if(s == 2) {
				ServiceReference serviceSensor = context.getServiceReference(Sensor.class);
				
				if (serviceSensor != null) {
					sensor = (Sensor) context.getService(serviceSensor);
					if(sensor != null) {
						TrafficGuardImpl.Sens(sensor);
						context.ungetService(serviceSensor);
					}else {
						System.out.println("TrafficGuard bundle cannot run!");
					}
				}else {
					System.out.println("TrafficGuard bundle cannot be found....");
				}
			}else {
				System.out.println("invalid input...");
			}
			System.out.println("----------------------------------------------------");
			System.out.println("Do you want to exit? \n 'yes' for YES \n 'no' for NO");
			System.out.println("");

			whileCon = sc.next();
			
		}while(whileCon.equals("no"));
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("TrafficGuard bundle stopped!");
	}

}
