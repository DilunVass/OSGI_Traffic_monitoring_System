package driver;

import java.util.Scanner;

public class DriverImpl {
	public static int Select() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("**********************************************");
			System.out.println("Select the service you need. \n 1 : Hospital service \n 2 : Mechanical support");
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
	
	public static int Select2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********************************************");
		System.out.println("What support you need to call");
		System.out.println("");
		
		int select = sc.nextInt();
		
		if(select == 1) {
			return 1;
		}else if(select == 2) {
			return 2;
		}else if(select == 3) {
			return 3;
		}else {
			System.out.println("Invalid input");
			return 0;
		}
	
	
}
}
