package MedianTests.Tests;

import Codes.Median.ConnectTabs;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.Assert.assertFalse;

public class InCorrectWorkingTest {
    @Test
    public void inCorrectWorkingTest() {
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

        // Get random number which is not in the random tab

        Random random = new Random();
        int randomNumber;

        do {
            randomNumber = random.nextInt();
        } while (isNumberInArray(randomNumber, connectedTab));


        //Extpected output
        String expectedMedian = String.valueOf(randomNumber);

        // Restore original System.in
        System.setIn(savedStandardInputStream);

        // Assert
        assertFalse(outputStreamCaptor.toString().contains(expectedMedian));

    }

    private static boolean isNumberInArray(int number, int[] array) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }
}
