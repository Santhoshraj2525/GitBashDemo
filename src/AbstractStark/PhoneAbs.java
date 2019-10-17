package AbstractStark;

public class PhoneAbs {

	public static void main(String[] args) {
	Phone IOS = new Iphone();
	Phone AOS = new MiPhone();
	show(IOS);	
	show(AOS);
	}
	public static void show(Phone obj) {
		obj.Config();
	}

}
abstract class Phone{
	public abstract void Config();
}
class Iphone extends Phone{
	public void Config() {
		System.out.println("Hi This is IPhone, My OS version is 10.0");
	}
}
class MiPhone extends Phone{
	public void Config() {
		System.out.println("Hi This is MI Phone, My OS Version is 11.2.3");
	}
}