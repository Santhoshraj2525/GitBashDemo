package AryaStark;

public class SuperKey {

	public static void main(String[] args) {
		SuperDi SD = new SuperDi();
		SD.Jam();
	}

}
class SuperDa{
	int k=7;
	/*public SuperDa() {
		System.out.println("I am Super key word from SuperDa class");
	}
	public SuperDa(int i) {
		System.out.println("I am Super key word from SuperDa class with parameters");
	}
*/
	public void Jam() {
		System.out.println("Hi I am Jim form parent class");
	}

}
class SuperDi extends SuperDa{
	int k=9;
	/*public SuperDi() {
		System.out.println("I am Super key word from SuperDii class");
	}
	public SuperDi(int i) {
		super(i);
		System.out.println("I am Super key word from SuperDiii class with parameters");
	}*/
	public void Jam() {
		super.Jam(); //calling the method which has the same name from Parent class
		System.out.println("Hi I am Jim form child class");
	}
	
	public void show() {
		System.out.println(super.k); // the Super Keyword is used for calling the objects from parent class
	}
}