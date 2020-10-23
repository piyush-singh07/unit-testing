package com.test.testclasses;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.carrier.cal.Adder;
import com.test.categories.NegativeTest;
import com.test.categories.PositiveTest;

public class AdderTest {
	
	static Adder adder;
	
	@Before
	public void setup()
	{
		adder= new Adder();
	}

	@Test
	@Category(PositiveTest.class)
	public void testPositiveAdd() {
		assertEquals("Result is not 10", 10, adder.add(9, 1));
	}
	
	@Test
	@Category(NegativeTest.class)
	public void testNegativeAdd() {
		assertNotEquals("Result is not as expected",11, adder.add(10, 0));
	}

}
