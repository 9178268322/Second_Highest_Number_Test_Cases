package com.ip.help;

import org.junit.Test;

import junit.framework.Assert;;


public class TestCaseClass {

	@Test
	public void test1() {
		int []arr = {1,3,5,6,4,7,34,10,5,0,-2,11};
		int result = DemoTest.secondHighestNumber(arr);
		Assert.assertEquals(result, 11);
	}
	
	@Test
	public void test2() {
		int []arr = {5,9,7,38,-3,12,32};
		int result = DemoTest.secondHighestNumber(arr);
		Assert.assertEquals(result, 32);
	}
	
}
