package AryaStark;

public class DynamicMethodDispatching {

	public static void main(String[] args) {
		AA obj1 = new AA();
		B obj2 = new B();
		
		AA a; //a is the reference of Class AA
		a=obj2; // But we are assigning the class B object for Dynamic Method Dispatching
		a.show(); 

	}
}
class AA{
	public void show() {
		System.out.println("Hi I am from class AAAAA");
	}
}
class B extends AA{
	public void show() {
		System.out.println("Hi I am from class BBBBB");
	}
}
