package AryaStark;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		int first =0;
		int second =1;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your favourite number : ");
		int n =sc.nextInt();
		System.out.print(first+" "+second);
		for(int i=0;i<=n;i++) {
			temp = first+second;
			System.out.print(temp+" ");
			first = second;
			second = temp;
		}

	}

}
