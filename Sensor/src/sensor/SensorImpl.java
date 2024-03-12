package sensor;

public class SensorImpl implements Sensor{

	@Override
	public Boolean checkSensors(int sensorSetID) {
		// TODO Auto-generated method stub
		if(sensorSetID == 1) {
			return true;
		}
		else if(sensorSetID == 2) {
			return false;
		}
		else if(sensorSetID == 3) {
			return false;
		}
		else {
			return null;
		}
		
	}

	@Override
	public String SensorData(int sensorSetID, String type) {
		// TODO Auto-generated method stub
		
		String output = "";

		// switch (sensorSetID) {
		// 	case 1: 
		// 	break;
		// 	case 2: {switch (type) {
		// 		case "s": return Sensor.speed_sensor;
		// 		break;
		// 		case "S": return Sensor.speed_sensor;
		// 		break;
		// 		case "l": return Sensor.light_sensor;
		// 		break;
		// 		case "L": return Sensor.light_sensor;
		// 		break;
		// 		case "r": return Sensor.rain_sensor;
		// 		break;
		// 		case "R": return Sensor.rain_sensor;
		// 		break;
		// 		case "ws": return Sensor.windSpeed_sensor;
		// 		break;
		// 		case "WS": return Sensor.windSpeed_sensor;
		// 		break;
		// 		case "t": return Sensor.temperature_sensor;
		// 		break;
		// 		case "T": return Sensor.temperature_sensor;
		// 		break;
		// 		default: return "Invalid input.";
		// 		break;
		// 		}
		// 	break;
		// 	}
		// 	case 3: switch (type) {
		// 		case "s": return Sensor.speed_sensor;
		// 		break;
		// 		case "S": return Sensor.speed_sensor;
		// 		break;
		// 		case "l": return Sensor.light_sensor;
		// 		break;
		// 		case "L": return Sensor.light_sensor;
		// 		break;
		// 		case "r": return Sensor.rain_sensor;
		// 		break;
		// 		case "R": return Sensor.rain_sensor;
		// 		break;
		// 		case "ws": return Sensor.windSpeed_sensor;
		// 		break;
		// 		case "WS": return Sensor.windSpeed_sensor;
		// 		break;
		// 		case "t": return Sensor.temperature_sensor;
		// 		break;
		// 		case "T": return Sensor.temperature_sensor;
		// 		break;
		// 		default: return "Invalid input.";
		// 	}
			
		// 	break;
		// 	default: return "Invalid sensor ID.";
		// 		break;
		// }
		if(sensorSetID == 1) {
			switch (type) {
				case "s": output = Sensor.speed_sensor;
				break;
				case "S": output = Sensor.speed_sensor;
				break;
				case "l": output = Sensor.light_sensor;
				break;
				case "L": output = Sensor.light_sensor;
				break;
				case "r": output = Sensor.rain_sensor;
				break;
				case "R": output = Sensor.rain_sensor;
				break;
				case "ws": output = Sensor.windSpeed_sensor;
				break;
				case "WS": output = Sensor.windSpeed_sensor;
				break;
				case "t": output = Sensor.temperature_sensor;
				break;
				case "T": output = Sensor.temperature_sensor;
				break;
				default: output = "Invalid input.";
			}
		}
		else if(sensorSetID == 2) {
			switch (type) {
				case "s": output = Sensor.speed_sensor;
				break;
				case "S": output = Sensor.speed_sensor;
				break;
				case "l": output = Sensor.light_sensor;
				break;
				case "L": output = Sensor.light_sensor;
				break;
				case "r": output = Sensor.rain_sensor;
				break;
				case "R": output = Sensor.rain_sensor;
				break;
				case "ws": output = Sensor.windSpeed_sensor;
				break;
				case "WS": output = Sensor.windSpeed_sensor;
				break;
				case "t": output = Sensor.temperature_sensor;
				break;
				case "T": output = Sensor.temperature_sensor;
				break;
				default: output = "Invalid input.";
			}
		}
		else if(sensorSetID == 3) {
			switch (type) {
				case "s": output = Sensor.speed_sensor;
				break;
				case "S": output = Sensor.speed_sensor;
				break;
				case "l": output = Sensor.light_sensor;
				break;
				case "L": output = Sensor.light_sensor;
				break;
				case "r": output = Sensor.rain_sensor;
				break;
				case "R": output = Sensor.rain_sensor;
				break;
				case "ws": output = Sensor.windSpeed_sensor;
				break;
				case "WS": output = Sensor.windSpeed_sensor;
				break;
				case "t": output = Sensor.temperature_sensor;
				break;
				case "T": output = Sensor.temperature_sensor;
				break;
				default: output = "Invalid input.";
			}
		}else {
			output = "invalid input";
		}
		return output;
	}

	public void ViewMenu() {
		// TODO Auto-generated method stub
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
		
	}

}
