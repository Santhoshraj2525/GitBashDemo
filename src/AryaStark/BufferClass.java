package AryaStark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferClass {

	public static void main(String[] args) throws IOException {
		String str ="";
		int i=0;
		//InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); // Anonymous object of the inputstream reader class
		i=Integer.parseInt(BR.readLine());
		System.out.println("Hello " +i);
	}

}
