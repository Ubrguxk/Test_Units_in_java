package MedianTests.Tests;

import Codes.Median.ConnectTabs;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class CorrectWorkingTest {
    @Test
    public void correctWorkingTest() {
        // Prepare test input
        String simulatedUserInput = "10\n10\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        ConnectTabs connectTabs = new ConnectTabs();

        //Get Connected tab
        int[] connectedTab = connectTabs.getTab();

        //Extpected output
        String expectedMedian = String.valueOf(calculateExpectedMedian(connectedTab));

        // Restore original System.in
        System.setIn(savedStandardInputStream);

        // Assert
        assertTrue(outputStreamCaptor.toString().contains(expectedMedian));

    }

    private int calculateExpectedMedian(int[] tab) {
        int middle = tab.length / 2;
        if (tab.length % 2 == 1) {
            return tab[middle];
        } else {
            return (tab[middle - 1] + tab[middle]) / 2;
        }
    }
}
