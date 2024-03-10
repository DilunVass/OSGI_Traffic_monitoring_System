package camara;

public class CamaraImpl implements Camara {
	

	@Override
	public String View(int camID, String camView) {
		int cam = 0;
		String view = null;
		switch(camID) {
			case 1: cam = Camara.cam1;
			break;
			case 2: cam = Camara.cam2;
			break;
			case 3: cam = Camara.cam3;
			break;
			default : System.out.println("Invalid carama ID");
		}
		
		if(camView == "f" || camView == "F") {
			view = Camara.front_view;
		}else if(camView == "r" || camView == "R") {
			view = Camara.rear_view;
		}else if(camView == "rs" || camView == "RS") {
			view = Camara.right_side_view;
		}else if(camView == "ls" || camView == "LS") {
			view = Camara.left_side_view;
		}else {
			System.out.println("Invalid carama view.");
		}
		return ("Camara ID = " + cam + " shows " + view + ".");
	}

	@Override
	public void ViewMenu() {
		// TODO Auto-generated method stub
		System.out.println("****************************************");
		System.out.println("Camaras");
		System.out.println("");
		System.out.println("Camara 1 : " + Camara.cam1);
		System.out.println("Camara 2 : " + Camara.cam2);
		System.out.println("Camara 3 : " + Camara.cam3);
		System.out.println("");
		System.out.println("Camara views");
		System.out.println(Camara.front_view + " : f or F");
		System.out.println(Camara.rear_view + " : r or R");
		System.out.println(Camara.right_side_view + " : rs or RS");
		System.out.println(Camara.left_side_view + " : ls or LS");
		System.out.println("****************************************");
		
	}

}
