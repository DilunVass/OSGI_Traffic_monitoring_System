package driver;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import emergencyservice.EmergencyService;

public class Activator implements BundleActivator {

	private static BundleContext context;
	private EmergencyService emergencyService;

	static BundleContext getContext() {
		return context;
	}
	
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Fetching traffic monitoring system...");
		Scanner sc = new Scanner(System.in);
		
		ServiceReference emergencyServ = context.getServiceReference(EmergencyService.class);
		if(emergencyServ != null) {
			emergencyService = (EmergencyService) context.getService(emergencyServ);		
			
			
			if(emergencyService != null ) {
				
				int choice = DriverImpl.Select();
				
				if(choice == 1) {
					System.out.println("Enter distance to the hospital...");
					double distance = sc.nextDouble();
					emergencyService.callHospital(distance);
					
					System.out.println("Ambulance is on the location in the given time");
					System.out.println("please refer instructions given ....");
						
					
				}else if(choice == 2) {
					System.out.println("Enter location...");
					String location = sc.next();
					emergencyService.callGarage(location);
					
					int choice2 = DriverImpl.Select2();
					
					if(choice2== 1) {
						System.out.println("Towing service called and will be on "+ location +"as soon as possible");
						
					}else if(choice2== 2){
						System.out.println("Mechanic support called and will be on "+ location +"as soon as possible");

					}else if(choice2== 2){
						System.out.println("Fuel Service called and will be on "+ location +"as soon as possible");

					}
				}
			}
			
			
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Good bye!!!");
		Activator.context = null;
	}

}
