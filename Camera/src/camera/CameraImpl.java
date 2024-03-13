package camera;

public class CameraImpl implements Camera {
	

	@Override
	public String View(int camID, String camView) {
		int cam = 0;
		String view = null;
		switch(camID) {
			case 1: cam = Camera.cam1;
			break;
			case 2: cam = Camera.cam2;
			break;
			case 3: cam = Camera.cam3;
			break;
			default : System.out.println("Invalid carama ID");
		}
		
		switch(camView) {
			case "f" : view = Camera.front_view;
			break;
			case "F" : view = Camera.front_view;
			break;
			case "r" : view = Camera.rear_view;
			break;
			case "R" : view = Camera.rear_view;
			break;
			case "rs" : view = Camera.right_side_view;
			break;
			case "RS" : view = Camera.right_side_view;
			break;
			case "ls" : view = Camera.left_side_view;
			break;
			case "LS" : view = Camera.left_side_view;
			break;
			default : view = "Invalid camara view";
		}
		
		return ("Camara ID = " + cam + " shows " + view + ".");
	}

	public void ViewMenu() {
		// TODO Auto-generated method stub
		System.out.println("****************************************");
		System.out.println("Cameras");
		System.out.println("");
		System.out.println("Camera 1 : " + Camera.cam1);
		System.out.println("Camera 2 : " + Camera.cam2);
		System.out.println("Camera 3 : " + Camera.cam3);
		System.out.println("");
		System.out.println("Camera views");
		System.out.println(Camera.front_view + " : f or F");
		System.out.println(Camera.rear_view + " : r or R");
		System.out.println(Camera.right_side_view + " : rs or RS");
		System.out.println(Camera.left_side_view + " : ls or LS");
		System.out.println("****************************************");
		
	}

}
