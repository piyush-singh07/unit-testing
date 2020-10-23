package com.test.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import com.test.testclasses.AdderTest;
import com.test.testclasses.DividerTest;
import com.test.testclasses.MultiplierTest;
import com.test.testclasses.SubtractTest;

@RunWith(Categories.class)
@IncludeCategory(NegativeTest.class)
@SuiteClasses({AdderTest.class,SubtractTest.class,MultiplierTest.class,DividerTest.class})
public class NegativeTestSuite {

}
