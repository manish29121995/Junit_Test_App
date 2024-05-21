package com.manish;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.manish.beans.Demo;

public class DemoTest {

	@Test
	public void testAdd() {
		Demo d = new Demo();
		int actualResult = d.add(14, 29);
		
		assertEquals(43, actualResult);
		
	}
	
	@Test
	public void testMul() {
		Demo d = new Demo();
		int actualRes = d.mul(19, 5);
		
		assertEquals(95, actualRes);
	}
}
