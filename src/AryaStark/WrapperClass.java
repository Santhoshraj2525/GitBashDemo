package AryaStark;

import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		int i=5;
		
		Integer ii= new Integer(i);//Boxing
		Integer jj= i; //Auto Boxing
		System.out.println(jj);
		
		ArrayList<Integer> AL = new ArrayList<>();
		AL.add(5);   //Usage of Auto Boxing
		AL.add(9);

}}
