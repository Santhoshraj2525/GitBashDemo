package InterfaceJava;

public class TestingInterface implements Test {
	
	public void RegressionTesting() {
		System.out.println("This is Regression Testing");
	}
	public void UnitTesting() {
		System.out.println("This is Unit Testing");
	}

	public static void main(String[] args) {
		Test.SprintTesting();
		TestingInterface obj1 = new TestingInterface();
		obj1.AutomationTesting();
		obj1.RegressionTesting();
		obj1.UnitTesting();

	}

}
