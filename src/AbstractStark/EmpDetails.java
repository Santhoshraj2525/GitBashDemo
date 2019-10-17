package AbstractStark;

public class EmpDetails extends Company{
	private int empID;
	public EmpDetails(String EN, String Gen, int EID) {
		super(EN,Gen);
		this.empID=EID;
		String Name = EN;
		String Gender = Gen;
	}
	public void work() {
		if(empID==0)
			System.out.println("He is not an employee of the company");
		else
			System.out.println("He is permanant employee of the company");
	}
	
	public static void main(String[] args) {
		EmpDetails CC = new EmpDetails("Ramesh","Male",0);
		EmpDetails DD = new EmpDetails("Mahesh","Male",230);
		CC.work();
		DD.work();
		DD.changeName("Salman");
		System.out.println(DD.tostring());
	}
}

