package com.ex.logical.strings;

public class IsDuplicateCharPresentInString {

	public static void main(String[] args) {
		 String s = "helloh";
		 
		 char[] charArray = s.toCharArray();
		 
		 for(int i=0; i<charArray.length; i++) {
			 for(int j=i+1; j<charArray.length; j++) {
				 if(charArray[i]==charArray[j]) {
					 System.out.println("repeated char is : " +charArray[i]);
					 
				 }
			 }
		 }

	}

}
