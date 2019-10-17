package AryaStark;

public class ThisKey {

	public static void main(String[] args) throws Exception {
		ThisDemo TD = new ThisDemo(25);
		TD.show();

	}

}
class ThisDemo{
	private int R;
	public ThisDemo(int R) {
		this.R=R; //THe This keyword seperates the instance variable from Local Variable
	}
	public void show() {
		System.out.println("The value of R is : " +R);
	}
}
