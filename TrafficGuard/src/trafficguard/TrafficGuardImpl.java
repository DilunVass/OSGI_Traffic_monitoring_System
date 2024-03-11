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
	
	public static void Cam() {
		Scanner sc = new Scanner(System.in);
		Camara.ViewMenu();
	}
	
	public static void Sens() {
		Sensor.ViewMenu();
	}
}
