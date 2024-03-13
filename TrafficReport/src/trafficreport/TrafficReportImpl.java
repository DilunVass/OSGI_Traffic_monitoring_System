package trafficreport;

public class TrafficReportImpl implements TrafficReport{

	@Override
	public String getTrafficReport() {
		String output = "++++ Traffic Report ++++++++++++++++++++++++++++++\n\n";
		output += "-> road violations      : 2\n";
		output += "-> emergency breakdowns : 4\n\n";
		output += "++++++++++++++++++++++++++++++++++++++++++++++++++";
		return output;
	}

}
