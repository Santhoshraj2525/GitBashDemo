package EncapsulationTraining;

public class PureEncap {

	public static void main(String[] args) throws Exception {
		Class cd = Class.forName("EncapsulationTraining.AccEmployees");
		AccEmployees EMPDETAILS = (AccEmployees)cd.newInstance();
		EMPDETAILS.setempID(11246499);
		EMPDETAILS.setempName("Santhoshraj Thangaraj");
		EMPDETAILS.getempID();
		EMPDETAILS.getempName();
	}

}
class AccEmployees{
	private int empID;
	private String empName;
	public void setempID(int ID) {
		this.empID = ID;
	}
	public void setempName(String Name) {
		this.empName=Name;
	}
	public void getempID() {
		System.out.println(empID);
	}
	public void getempName() {
		System.out.println(empName);
	}
}
