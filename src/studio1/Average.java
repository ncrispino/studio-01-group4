package studio1;

import support.cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap= new ArgsProcessor(args); 
		
		int n1 = ap.nextInt("integer 1");
		int n2 = ap.nextInt("integer 2");
		double average = (n1 + n2)/2.0;
		
		System.out.println("Average of " + n1 + " and " + n2 + " is " + average);
	}

}
