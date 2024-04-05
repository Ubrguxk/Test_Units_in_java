package SpiralTests;

import SpiralTests.Tests.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CorrectWorkingTest.class,
        SizesTests.class,
        UncorrectVariableTest.class,
        ZeroTests.class
})

public class TestSuiteSpiral {}