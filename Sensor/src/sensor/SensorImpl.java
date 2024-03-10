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
	public String SensorData(int sensorSetID, String view) {
		// TODO Auto-generated method stub
		if(sensorSetID == 1) {
			if(view == "s" || view == "S") {
				return Sensor.speed_sensor;
			}else if(view == "l" || view == "L") {
				return Sensor.light_sensor;
			}else if(view == "r" || view == "R") {
				return Sensor.rain_sensor;
			}else if(view == "ws" || view == "WS") {
				return Sensor.windSpeed_sensor;
			}else if(view == "t" || view == "T") {
				return Sensor.temperature_sensor;
			}else {
				return "Invalid sensor ID.";
			}
		}
		else if(sensorSetID == 2) {
			if(view == "s" || view == "S") {
				return Sensor.speed_sensor;
			}else if(view == "l" || view == "L") {
				return Sensor.light_sensor;
			}else if(view == "r" || view == "R") {
				return Sensor.rain_sensor;
			}else if(view == "ws" || view == "WS") {
				return Sensor.windSpeed_sensor;
			}else if(view == "t" || view == "T") {
				return Sensor.temperature_sensor;
			}else {
				return "Invalid sensor ID.";
			}
		}
		else if(sensorSetID == 3) {
			if(view == "s" || view == "S") {
				return Sensor.speed_sensor;
			}else if(view == "l" || view == "L") {
				return Sensor.light_sensor;
			}else if(view == "r" || view == "R") {
				return Sensor.rain_sensor;
			}else if(view == "ws" || view == "WS") {
				return Sensor.windSpeed_sensor;
			}else if(view == "t" || view == "T") {
				return Sensor.temperature_sensor;
			}else {
				return "Invalid sensor ID.";
			}
		}
		return null;
	}

	@Override
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
