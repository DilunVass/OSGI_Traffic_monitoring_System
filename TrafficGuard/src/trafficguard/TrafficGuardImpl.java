package trafficguard;

import camara.Camara;
import sensor.Sensor;

import java.util.Scanner;

public class TrafficGuardImpl {

	
	
	public static int Select() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("Select what need to monitor. \n 1 : Camara \n 2 : Sensors");
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
	
	public static void Cam(Camara cam) {
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
		sens.ViewMenu();
	}
}
