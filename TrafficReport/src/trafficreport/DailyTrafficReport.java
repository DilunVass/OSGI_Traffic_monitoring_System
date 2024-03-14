package trafficreport;

public class DailyTrafficReport implements TrafficReport{

	@Override
	public String getTrafficReport() {
		String output = "";
		output += "++++ Traffic Report (Daily) ++++++++++++++++++++++++++++++\n\n";
		output += "-> road violations           : 2\n";
		output += "-> emergency breakdowns      : 4\n";
		output += "-> Accidents and Incidents   : 3\n";
		output += "-> Road Closures and Detours : 2\n";
		output += "-> Highway Patrol Alerts     : 1\n\n";
		output += "++++++++++++++++++++++++++++++++++++++++++++++++++";
		return output;
	}
}
