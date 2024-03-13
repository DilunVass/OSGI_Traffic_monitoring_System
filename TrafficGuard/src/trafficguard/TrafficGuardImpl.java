package trafficguard;

import sensor.Sensor;

import java.util.Scanner;

import camera.Camera;

public class TrafficGuardImpl {

	
	
	public static int Select() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("Select what need to monitor. \n 1 : Camera \n 2 : Sensors");
		System.out.println("");
		
		int select = sc.nextInt();
		
		if(select == 1) {
			return 1;
		}else if(select == 2) {
			return 2;
		}else {
			System.out.println("Invalid input");
			return 0;
		}
		
		
	}
	
	public static void Cam(Camera cam) {
		Scanner sc = new Scanner(System.in);
		cam.ViewMenu();
		
		int id;
		String camView;
		
		System.out.print("Enter camara ID : ");
		id = sc.nextInt();
		
		System.out.print("Enter camara view : ");
		camView = sc.next();
		
//		cam.View(id, camView);
		System.out.println("Camara shows : " + cam.View(id, camView));
		System.out.print("Enter camara view : " + camView);
	}
	
	public static void Sens(Sensor sens) {
		Scanner sc = new Scanner(System.in);
		sens.ViewMenu();
		String choice = "no";
		int id;
		String type;
		boolean status = false;
		System.out.print("Do you want check sensors? : yes or no");
		choice = sc.next();
		
		
		while(choice.equals("yes")) {
			
			System.out.print("Enter sensor ID : ");
			id = sc.nextInt();
			
			status = sens.checkSensors(id);
			if(status == true) {
				System.out.println("Sensor set ID : " + id + " is working.");
			}else {
				System.out.println("Sensor set ID : " + id + " is not working.");
			}
			
			System.out.print("Do you want check sensors? : yes or no");
			choice = sc.next();
		}
		
		System.out.print("Select Sensor set ID : 1,2,3 : ");
		id = sc.nextInt();
		System.out.print("What do you want to measure : s,l,r,ws,t : ");
		type = sc.next();
		
		System.out.println(sens.SensorData(id, type));
		
		
//		if(choice == "yes") {
//			
//		}
	}
}
