package TripletsTests;

import TripletsTests.Tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CorrectWorkingTest.class,
        NoTripletsTests.class,
        UnCorrectWorkingTest.class,
        ZeroNumTest.class
})

public class TestSuiteTriplets {}