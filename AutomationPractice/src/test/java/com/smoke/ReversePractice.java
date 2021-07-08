package com.smoke;

public class ReversePractice {

	//static String name="Swayid Rahman";
	
	//public static void main(String[] args) {
	 
		//for(int i=0;i<name.length();i++) {
			//System.out.println(name.charAt(i));
		//}
		
		
		//for(int i=(name.length()-1);i>=0;i--) {
			//System.out.println(name.charAt(i));
		//}}
		
	public static void getStringReverse(String name)	{
		
	for(int i=(name.length()-1);i>=0;i--)	{
		System.out.println(name.charAt(i));
	}

	}

public static void main(String[] args) {
	
	ReversePractice.getStringReverse("Fabiha Rahman");
}
}