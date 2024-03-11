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
//		String choice = "no";
		
		ServiceReference serviceCam = context.getServiceReference(Camara.class);
		ServiceReference serviceSensor = context.getServiceReference(Sensor.class);
		if(serviceCam != null && serviceSensor != null) {
			camara = (Camara) context.getService(serviceCam);
			sensor = (Sensor) context.getService(serviceSensor);
			
			
			
			if(camara != null && sensor != null) {
				
				int choice = TrafficGuardImpl.Select();
				
				if(choice == 1) {
					System.out.println("camara...");
					System.out.println("****************************************");
					System.out.println("Camaras");
					System.out.println("");
					System.out.println("Camara 1 : " + Camara.cam1);
					System.out.println("Camara 2 : " + Camara.cam2);
					System.out.println("Camara 3 : " + Camara.cam3);
					System.out.println("");
					int camID = sc.nextInt();
					System.out.println("Camara views");
					System.out.println(Camara.front_view + " : f or F");
					System.out.println(Camara.rear_view + " : r or R");
					System.out.println(Camara.right_side_view + " : rs or RS");
					System.out.println(Camara.left_side_view + " : ls or LS");
					System.out.println("****************************************");
					String camView = sc.next();
					
					
					String view = null;
					switch(camID) {
					case 1: camID = Camara.cam1;
					break;
					case 2: camID = Camara.cam2;
					break;
					case 3: camID = Camara.cam3;
					break;
					default : System.out.println("Invalid carama ID");
				}
				
				if(camView == "f" || camView == "F") {
					view = Camara.front_view;
				}else if(camView == "r" || camView == "R") {
					view = Camara.rear_view;
				}else if(camView == "rs" || camView == "RS") {
					view = Camara.right_side_view;
				}else if(camView == "ls" || camView == "LS") {
					view = Camara.left_side_view;
				}else {
					System.out.println("Invalid carama view.");
				}
				System.out.println ("Camara ID = " + camID + " shows " + view + ".");
					
				}else if(choice == 2) {
					System.out.println("Sensors...");
					TrafficGuardImpl.Sens();
					System.out.println("****************************************");
					System.out.println("Sensors");
					System.out.println("");
					System.out.println("Sensor Set 1 : " + Sensor.sensorSet1);
					System.out.println("Sensor Set 2 : " + Sensor.sensorSet2);
					System.out.println("Sensor Set 3 : " + Sensor.sensorSet3);
					System.out.println("");
					System.out.println("Sensor outputs");
					System.out.println(Sensor.speed_sensor + " : s or S");
					System.out.println(Sensor.light_sensor + " : l or L");
					System.out.println(Sensor.rain_sensor + " : r or R");
					System.out.println(Sensor.windSpeed_sensor + " : ws or WS");
					System.out.println(Sensor.temperature_sensor + " : t or T");
					System.out.println("****************************************");
					
					int test = sc.nextInt();
				}
			}
			
			
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
