package InterfaceJava;

public interface Test {
	
	void RegressionTesting();
	void UnitTesting();
	default void AutomationTesting() {
		System.out.println("This is automation testing...");
	}
	static void SprintTesting() {
		System.out.println("This is Sprint Testing....");
	}

}
