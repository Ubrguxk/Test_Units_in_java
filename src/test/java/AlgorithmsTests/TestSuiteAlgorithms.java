package AlgorithmsTests;

import AlgorithmsTests.Tests.*;
import Codes.Algorithms.Context;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        BubbleSortTest.class,
        CombSortTest.class,
        ContextInputTest.class,
        InsertionSortTest.class,
        QuickSortTest.class,
        SelectSortTest.class
})

public class TestSuiteAlgorithms {}