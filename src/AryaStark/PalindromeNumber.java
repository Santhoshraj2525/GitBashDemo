package AryaStark;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int r,s=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number");
		int n = sc.nextInt();
		int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			s=s*10+r;
		}if(t==s) {
			System.out.println(t+ " is palindrome Number");
		}else {
			System.out.println(t+ " is not a palindrome Number");
		}

	}

}
