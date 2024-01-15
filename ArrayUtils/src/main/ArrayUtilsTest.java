package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayUtilsTest {

	@Test 

	public void testFindMax(){ 
		ArrayUtils util = new ArrayUtils();
		assertEquals(5, util.findMax(new int[]{4,5,-1,2})); 
		assertEquals(6, util.findMax(new int[]{6,-1,-6,-5})); 
		assertEquals(600, util.findMax(new int[]{100,-500,600})); 
	} 

}
