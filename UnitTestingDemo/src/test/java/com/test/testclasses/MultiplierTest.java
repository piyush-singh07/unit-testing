package com.test.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.carrier.cal.Multiplier;
import com.test.categories.NegativeTest;
import com.test.categories.PositiveTest;

public class MultiplierTest {

	static Multiplier multiplier;
	
	@Before
	public void setup()
	{
		multiplier= new Multiplier();
	}
	
	@After
	public void teardown()
	{
		multiplier= null;
	}

	@Test
	@Category(PositiveTest.class)
	public void testPositiveMul() {
		assertEquals("Result is not 10", 10, multiplier.multiply(2, 5));
	}
	
	@Test
	@Category(NegativeTest.class)
	public void testNegativeMul() {
		assertNotEquals("Result is not as expected", 10, multiplier.multiply(10, 10));
	}


}
