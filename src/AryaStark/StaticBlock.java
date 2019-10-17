package AryaStark;

public class StaticBlock {
	static String s="";
	static {
		s="This is Static Block";
	}
	/*public void Test() {
		s="This is a method";
	}
	public void show() {
		System.out.println("Hi...This is Santhoshraj");
	}*/
	
	public static void main(String[] args) {
		
		StaticBlock SB = new StaticBlock();
		//SB.Test();
		System.out.println(s);

	}

}
