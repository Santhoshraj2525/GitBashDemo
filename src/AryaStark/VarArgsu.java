package AryaStark;

public class VarArgsu {

	public static void main(String[] args) {
		TrainVarArgs obj = new TrainVarArgs();
		obj.show(5,6,7,8,9);

	}

}	
class TrainVarArgs{
	public void show(int ... a) {
		for(int i:a)
		System.out.println(i);
	}
}
