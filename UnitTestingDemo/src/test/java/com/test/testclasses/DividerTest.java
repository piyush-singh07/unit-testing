package com.test.testclasses;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.carrier.cal.Divider;
import com.test.categories.NegativeTest;
import com.test.categories.PositiveTest;

public class DividerTest {

	static Divider divider;
	
	@Before
	public void setup()
	{
		divider= new Divider();
	}
	
	@After
	public void teardown()
	{
		divider= null;
	}

	@Test
	@Category(PositiveTest.class)
	public void testPositiveDivide() {
		assertEquals("Result is not 10", 10, divider.divide(100, 10));
	}
	
	@Test(expected = ArithmeticException.class)
	@Category(NegativeTest.class)
	public void testNegativeDivide() {
		divider.divide(10, 0);
	}

}
