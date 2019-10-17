package AryaStark;

public class StringSpliting {

	public static void main(String[] args) {
		String Names = "Santhosraj, Gnanavel, Thoufic, Rahuman, Vignesh";
		System.out.println(Names);
		String Attend[]=Names.split(",");
		for(String Heroes:Attend)
			System.out.print(Heroes+ " ");

	}

}
