package com.homework;

public class HWReversePractice {

public static void getStringReverse(String name)	{
	
	
	for(int i=(name.length()-1);i>=0;i--)  {       
	System.out.println(name.charAt(i));
}
	
}	
public static void main(String[] args) {
	HWReversePractice.getStringReverse("Bangladesh");
}	

}
