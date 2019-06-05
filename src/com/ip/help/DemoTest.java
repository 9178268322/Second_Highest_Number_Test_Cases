package com.ip.help;

public class DemoTest {
	
	public static int secondHighestNumber(int []arr) {
		
		int second = 0;
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				second = max;
				max = arr[i];  
			}
			else if( arr[i]> second)	{
		    	  second = arr[i];
			}
				
		}
		return second;
	}
}
