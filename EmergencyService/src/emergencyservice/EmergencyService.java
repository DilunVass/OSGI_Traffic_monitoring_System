package emergencyservice;

public interface EmergencyService {
	public void callHospital(double distance);

	public void callGarage(String problem);

	public int Ambulance = 1990;
	public String FirstAid = "Provide Basic First Aid:\r\n"
			+ "\r\n"
			+ "Check for responsiveness:\r\n"
			+ "Ask loudly, \"Are you okay?\"\r\n"
			+ "If no response, gently shake the person's shoulders.\r\n"
			+ "Open the airway:\r\n"
			+ "Tilt the person's head back slightly, lift the chin, and check for breathing.\r\n"
			+ "If not breathing normally, begin CPR if you're trained to do so.\r\n"
			+ "Control bleeding:\r\n"
			+ "Apply direct pressure to any bleeding wounds with a clean cloth or bandage.\r\n"
			+ "Elevate the injured limb if possible.\r\n"
			+ "Immobilize injuries:\r\n"
			+ "If you suspect a spinal injury, avoid moving the person's head or neck. Keep them still.\r\n"
			+ "Support injured limbs using splints or slings.\r\n"
			+ "Treat for shock:\r\n"
			+ "Keep the person warm and comfortable.\r\n"
			+ "Elevate the legs slightly if there are no leg injuries.\r\n"
			+ "Monitor vital signs:\r\n"
			+ "Check breathing, pulse, and level of consciousness regularly.\r\n"
			+ "Provide reassurance and comfort.";
	
	public String TowingNo = "+94123456789";
	public String Mechanic = "+94111111111";
	public String FuelService = "+9422222222";
}
