package trafficreport;

public class TrafficReportImpl{

	private TrafficReport trafficReport;
	
	public String displayTrafficReport(int response) {
		if(response == 1) {
			trafficReport = new DailyTrafficReport();
			return trafficReport.getTrafficReport();
		}else if(response == 2) {
			trafficReport = new WeeklyTrafficReport();
			return trafficReport.getTrafficReport();
		}
		return null;
	}
}
