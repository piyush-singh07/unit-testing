package com.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.testclasses.DividerTest;
import com.test.testclasses.SubtractTest;

@RunWith(Suite.class)
@SuiteClasses({SubtractTest.class,DividerTest.class})
public class MySubDivideSuite {

}
