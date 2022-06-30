package com.qa.array;

public class Arrays{

//	public static int[] testArray = {1, 2, 3, 4, 5, 6, 11, 8, 9, 10};
//
//	  public static void main(String[] args) {
//		  for(int i = 0; i < testArray.length; i++) {
//			  System.out.println(i + ": " + testArray[i]);
//		  }
//	  }
	  
	 public static int[] anArray = new int[10];
	 
	 public static void main(String[] args) {
		 for (int i = 0; i < anArray.length; i++) {
			 anArray[i] = i + 1;
			 System.out.println(i + ": " + anArray[i]);
		 }
		 for (int i = 0; i < anArray.length; i++) {
			 anArray[i] *= 10;
			 System.out.println(i + ": " + anArray[i]);
		 } 
	 }
}
	 
	  

