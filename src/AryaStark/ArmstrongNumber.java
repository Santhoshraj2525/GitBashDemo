package AryaStark;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=153;
		int temp = n;
		int r, s=0;
		while(n>0) {
		r=n%10;
		n=n/10;
		s = s + r*r*r;
		}
		if(temp==s)
			System.out.println(temp+ " is an Armstrong Number");
		else
			System.out.println(temp+ " is not an Armstrong Number");
	}

}
