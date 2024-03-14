package trafficreport;

public class WeeklyTrafficReport implements TrafficReport {

	@Override
	public String getTrafficReport() {
		String output = "";
		output = "++++ Traffic Report (Weekly) ++++++++++++++++++++++++++++++\n\n";
		output += "-> Overall road violations        : 2\n";
		output += "-> Long Construction Zones        : 4\n";
		output += "-> Accidents and Incidents        : 3\n";
		output += "-> Temporary Closures and Detours : 2\n";
		output += "-> Emergence Raids                : 2\n";
		output += "-> Special Events                 : 1\n\n";
		output += "++++++++++++++++++++++++++++++++++++++++++++++++++";
		return output;
	}

}
