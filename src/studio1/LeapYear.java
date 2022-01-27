package studio1;

import support.cse131.ArgsProcessor;

public class LeapYear {
	public static void main(String[] args) {
	ArgsProcessor ap= new ArgsProcessor(args); 
	int year = ap.nextInt ("what year?");
boolean isLYear = (year%4 == 0 && (year%100 > 1 || year%400 == 0));
System.out.println(isLYear);
	}
}
