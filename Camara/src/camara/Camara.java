package camara;

public interface Camara {

	public int cam1 = 1;
	public int cam2 = 2;
	public int cam3 = 3;
	
	public String front_view = "front view";
	public String rear_view = "back veiw";
	public String right_side_view = "right side view";
	public String left_side_view = "side view";
	
	public String View(int camID, String view);
	public void ViewMenu();
	
	
}
