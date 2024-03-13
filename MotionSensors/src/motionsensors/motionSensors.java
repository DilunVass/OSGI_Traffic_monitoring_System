package motionsensors;

public interface motionSensors {

	public int juncture1 = 1;
	public int juncture2 = 2;
	public int juncture3 = 3;
	public int juncture4 = 4;
	
	public int road1 = 1;
	public int road2 = 2;
	public int road3 = 3;
	public int road4 = 4;
	
	public boolean road1Status = true;
	public boolean road2Status = false;
	public boolean road3Status = true;
	public boolean road4Status = false;
	
	public String RoadClarity(int junctureID);
	public String RoadClarity(int junctureID, int roadID);
}
