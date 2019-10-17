package AryaStark;

public class FinalKey {

	public static void main(String[] args) {
		/*final int i; //Final key word usage in variables - Once Assigned it will be fixed
		i=5;
		System.out.println(i);*/
		Rep R = new Rep();
		R.show();
	}

}
/*final*/ class Panasonic{
	final public void show() {
		System.out.println("Hello panasonic");
	}
}
class Rep extends Panasonic{
	/*public void show() {//it will throw an error because of final key word in parent class method
		System.out.println("hello Rep");
	}*/
}
