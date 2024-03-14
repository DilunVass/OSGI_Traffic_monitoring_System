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
}
