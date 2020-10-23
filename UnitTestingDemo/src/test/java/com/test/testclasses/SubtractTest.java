package com.test.testclasses;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.carrier.cal.Subtract;
import com.test.categories.NegativeTest;
import com.test.categories.PositiveTest;

public class SubtractTest {

	static Subtract subtract;
	
	@Before
	public void setup()
	{
		subtract= new Subtract();
	}
	
	@After
	public void teardown()
	{
		subtract= null;
	}

	@Test
	@Category(PositiveTest.class)
	public void testPositiveMul() {
		assertEquals("Result is not 10", 10, subtract.sub(15, 5));
	}
	
	@Test
	@Category(NegativeTest.class)
	public void testNegativeMul() {
		assertNotEquals("Result is not as expected", 10, subtract.sub(10, 10));
	}

}
