package com.valuemomentum.training.testing.junitdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SuitTest1.class, SuitTest2.class })
public class AllTests {

}
