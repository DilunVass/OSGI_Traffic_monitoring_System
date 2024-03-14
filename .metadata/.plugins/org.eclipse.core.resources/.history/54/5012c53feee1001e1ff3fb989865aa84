package emergencyservice;

public class EmergencyServiceImpl implements EmergencyService{
	
	EmergencyService emergencyService;

	@Override
	public void callHospital(double distance) {
		double time = 0;
		time = (distance/60) + 5;
		
		System.out.println("****************************************");
		System.out.println("Hospital Service");
		System.out.println("");
		System.out.println("Ambulance is Called" + EmergencyService.Ambulance );
		System.out.println("Ambulance will reach in " + time + "minutes" );
		System.out.println("First Aid Instructions" + EmergencyService.FirstAid );
		System.out.println("****************************************");
	}

	@Override
	public void callGarage(String problem) {
		// TODO Auto-generated method stub
		System.out.println("****************************************");
		System.out.println("Mechanical Support");
		System.out.println("");
		System.out.println("Towing Services " + emergencyService.TowingNo );
		System.out.println("Mechanic or Repair Shop" + emergencyService.Mechanic );
		System.out.println("Fuel Delivery Services" + emergencyService.FuelService );
		System.out.println("****************************************");
	}


}
