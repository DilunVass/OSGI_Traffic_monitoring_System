package motionsensors;

public class motionSensorImpl implements motionSensors{

	@Override
	public String RoadClarity(int junctureID) {
		
		String output = "";
		switch (junctureID) {
			case 1 :  output = "Road 1 is " + Status(road1Status) + " and Road 2 is " + Status(road2Status) + "Road 3 is " + Status(road3Status) + " and Road 4 is " + Status(road4Status) + ".";
				
				break;
			case 2 :  output = "Road 1 is " + Status(road1Status) + " and Road 2 is " + Status(road2Status) + "Road 3 is " + Status(road3Status) + ".";
				
				break;
			case 3 :  output = "Road 1 is " + Status(road1Status) + " and Road 2 is " + Status(road2Status) + ".";
				
				break;
			case 4 :  output = "Road 1 is " + Status(road1Status) + " and Road 2 is " + Status(road2Status) + "Road 3 is " + Status(road3Status) + " and Road 4 is " + Status(road4Status) + ".";
				
				break;
			default: output = "Invalid input.";
				break;
		}
		return output;
	}

	@Override
	public String RoadClarity(int junctureID, int roadID) {
		
		String output = "";
		if (junctureID == 1) {
			switch (roadID) {
				case 1 : output = "Road 1 is " + Status(road1Status) + ".";
					
					break;
				case 2 : output = "Road 2 is " + Status(road2Status) + ".";
					
					break;
				case 3 : output = "Road 3 is " + Status(road3Status) + ".";
					
					break;
				case 4 : output = "Road 4 is " + Status(road4Status) + ".";
					
					break;
				default: output = "Invalid input.";
					break;
			}
		}else if (junctureID == 2) {
			switch (roadID) {
				case 1 : output = "Road 1 is " + Status(road1Status) + ".";
					
					break;
				case 2 : output = "Road 2 is " + Status(road2Status) + ".";
					
					break;
				case 3 : output = "Road 3 is " + Status(road3Status) + ".";
					
					break;
				default: output = "Invalid input.";
					break;
			}
			
		}else if (junctureID == 3) {
			switch (roadID) {
				case 1 : output = "Road 1 is " + Status(road1Status) + ".";
					
					break;
				case 2 : output = "Road 2 is " + Status(road2Status) + ".";
					
					break;
				default: output = "Invalid input.";
					break;
			}

		}else if (junctureID == 4) {
			switch (roadID) {
				case 1 : output = "Road 1 is " + Status(road1Status) + ".";
					
					break;
				case 2 : output = "Road 2 is " + Status(road2Status) + ".";
					
					break;
				case 3 : output = "Road 3 is " + Status(road3Status) + ".";
					
					break;
				case 4 : output = "Road 4 is " + Status(road4Status) + ".";
					
					break;
				default: output = "Invalid input.";
					break;
			}
		}
		return output;
	}

	private String Status(boolean roadStatus) {
		
		if(roadStatus == true) {
			return "Clear";
		}
		else {
			return "Not Clear";
		}
	}

}
