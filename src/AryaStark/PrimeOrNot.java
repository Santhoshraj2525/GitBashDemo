package AryaStark;

public class PrimeOrNot {

	public static void main(String[] args) {
		int n=8;
		boolean isPrime = false;
		for(int i=2;i<n;i++) {
			if(n%i==0)
				isPrime = true;
		}
		if (isPrime)
			System.out.println(n+ " is not a prime number");
		else
			System.out.println(n+ " is a prime number");

	}

}
