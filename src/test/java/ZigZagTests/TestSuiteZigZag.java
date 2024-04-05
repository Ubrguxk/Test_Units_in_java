package ZigZagTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ZigZagTests.Tests.*;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CorrectWorkingTest.class,
        EmptyRowsTest.class,
        EmptyRowsTest.class,
        SingleRowTest.class,
        UnCorrectWorkingTest.class
})

public class TestSuiteZigZag {}