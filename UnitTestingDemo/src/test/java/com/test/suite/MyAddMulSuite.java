package com.test.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.test.testclasses.AdderTest;
import com.test.testclasses.MultiplierTest;

@RunWith(Suite.class)
@SuiteClasses({AdderTest.class,MultiplierTest.class})
public class MyAddMulSuite {

}
