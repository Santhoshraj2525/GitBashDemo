package AbstractStark;

public abstract class Company {
	private String empName;
	private String Gender;
	public Company(String EN, String Gen) {
		this.empName=EN;
		this.Gender=Gen;
	}
	public abstract void work();
	public String tostring() {
		return "Name= " +this.empName+ " Gender = " +this.Gender;
	}
	public void changeName(String NewName) {
		this.empName=NewName;


//added by sandy
=======
//emp name changed by santhoshraj
>>>>>>> commited by santhoshraj
	}
}

