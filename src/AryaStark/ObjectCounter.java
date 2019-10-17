package AryaStark;

public class ObjectCounter {

	public static void main(String[] args) {
		CounterTheObj Obj1 = new CounterTheObj();
		CounterTheObj Obj2 = new CounterTheObj();
		CounterTheObj Obj3 = new CounterTheObj();
		CounterTheObj Obj4 = new CounterTheObj();
		CounterTheObj Obj5 = new CounterTheObj();
		CounterTheObj Obj6 = new CounterTheObj();
		CounterTheObj Obj7 = new CounterTheObj();
		CounterTheObj Obj8 = new CounterTheObj();
		Obj6.show();

	}

}

class CounterTheObj{
	static int i;
	public CounterTheObj() {
		i++;
	}
	public void show() {
		System.out.println(i);
	}
}
