package trafficlightsystem;

import java.util.Scanner;

import motionsensors.motionSensors;

public class TrafficLightSystemImpl {

	public static void MotionSensorData(motionSensors ms){
        Scanner sc = new Scanner(System.in);
        String choice2 = "no";
        System.out.println("**********************************************");
        System.out.println("Motion Sensor Service");
        System.out.println("**********************************************");
        System.out.println("Do you want to check the status of the junction? yes or no");
        String choice = sc.next();
       

        while (choice.equals("yes")){
            System.out.println("Enter the junction ID : ");
            int junctureID = sc.nextInt();
            System.out.println(ms.RoadClarity(junctureID));

            System.out.println("Do you want to check the status of the junction? yes or no");
            choice = sc.next();
        }
        
        System.out.println("Do you want to check the status of the road? yes or no");
        choice2 = sc.next();

        while (choice2.equals("yes")){
            System.out.println("Enter the junction ID : ");
            int junctureID = sc.nextInt();
            System.out.println("Enter the road ID : ");
            int roadID = sc.nextInt();
            System.out.println(ms.RoadClarity(junctureID, roadID));

            System.out.println("Do you want to check the status of the road? yes or no");
            choice2 = sc.next();
        }

    }
}
