package AryaStark;

public class toStringDemo {

	public static void main(String[] args) {
		students Obj = new students(123, "Santhos");
		System.out.println(Obj);
	}

}
class students{
	int RollNo;
	String Name;
	public students(int RollNo, String Name) {
		this.RollNo=RollNo;
		this.Name=Name;
	}
	public String toString() {
		return RollNo+ " " +Name;
	}
}
