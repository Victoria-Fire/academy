package by.academy.junit.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import by.academy.junit.SecondMathTest;
import by.academy.junit.SimpleMathTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ SimpleMathTest.class, SecondMathTest.class })
public class SuiteTestDemo {

}
