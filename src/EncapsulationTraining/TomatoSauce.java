package EncapsulationTraining;

import java.util.Scanner;

public class TomatoSauce {

	public static void main(String[] args) throws Exception {
		Class cc= Class.forName("EncapsulationTraining.Maggi");
		Maggi MS = (Maggi)cc.newInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter you first Number : ");
		int D = sc.nextInt();
		System.out.print("Please enter your second Number : ");
		int F = sc.nextInt();
		MS.setI(D,F);
		System.out.println(MS.getI());
	}

}
