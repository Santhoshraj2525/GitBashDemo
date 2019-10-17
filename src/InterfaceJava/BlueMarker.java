package InterfaceJava;

public class BlueMarker extends RedMarkerI{

	public static void main(String[] args) {
		RedMarkerI RM1 = new RedMarkerI();
		if(RM1 instanceof MarkerInterface) {
			RM1.show();
		}
		else {
			System.out.println("Access Denied");
		}

	}

}
