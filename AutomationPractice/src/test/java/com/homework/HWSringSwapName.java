package com.homework;

import java.util.Arrays;

public class HWSringSwapName {

	
	static String citiName = "I Love New York";	
	
	 static void getCitiname() {
	
		 String[] pieces = citiName.split(" ");	
			
		 System.out.println(Arrays.toString(pieces));

	 }
	
	public static void main(String[] args) {
		getCitiname();
	}
}