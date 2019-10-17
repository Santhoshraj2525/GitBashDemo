package AryaStark;

public class ClassInitianziation {

	public static void main(String[] args) throws ClassNotFoundException, Exception, IllegalAccessException {
		Class c = Class.forName("AryaStark.StaticBlock");
		StaticBlock s= (StaticBlock)c.newInstance();
		//s.show();
	}

}
