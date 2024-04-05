package MedianTests;

import MedianTests.Tests.*;
import MedianTests.Tests.CorrectWorkingTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CorrectWorkingTest.class,
        InCorrectWorkingTest.class,
        SizesTests.class,
        ZeroTests.class
})

public class TestSuiteMedian {}