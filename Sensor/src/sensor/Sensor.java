package sensor;

public interface Sensor {

	public int sensorSet1 = 1;
	public int sensorSet2 = 2;
	public int sensorSet3 = 3;
	
	public String speed_sensor = "Shows speed of the car.";
	public String light_sensor = "Shows ligt level.";
	public String rain_sensor = "Shows rain conditions.";
	public String windSpeed_sensor = "Shows wind speed.";
	public String temperature_sensor = "Shows temperature";
	
	public Boolean checkSensors(int sensorSetID);
	public String SensorData(int sensorSetID, String view);
	public static void ViewMenu() {
		// TODO Auto-generated method stub
		
	}
}
