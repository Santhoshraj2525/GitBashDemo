package AryaStark;

public class PerfectNumber {

	public static void main(String[] args) {
		int n=101;
		boolean b= IsPerfect(n);
		if(b) {
			System.out.println(n+ " is a perfect number");
		}else {
			System.out.println(n+ " is not a perfect number");
		}

	}
	public static boolean  IsPerfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			sum += i;
		}
		}if(n==sum)
			return true;
		return false;
	}

}
