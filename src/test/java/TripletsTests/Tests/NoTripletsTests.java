package TripletsTests.Tests;

import Codes.Triplets.CalculateTriplets;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

public class NoTripletsTests {
    private InputStream savedStandardInputStream;
    @After
    public void restoreSystemInputAndOutput() {
        System.setIn(savedStandardInputStream);
        System.setOut(System.out);
    }
    @Test
    public void oneElementTest() {
        // Prepare test input
        String simulatedUserInput = "1\n1";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        CalculateTriplets calculateTriplets = new CalculateTriplets();

        // Define expected output
        String expectedOutput = "No triplets found.";

        // Assert
        assertTrue(outputStreamCaptor.toString().contains(expectedOutput));

    }

    @Test
    public void threeElementsNotSumingZero() {
        // Prepare test input
        String simulatedUserInput = "3\n1\n1\n1";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        CalculateTriplets calculateTriplets = new CalculateTriplets();

        // Restore original System.in
        System.setIn(savedStandardInputStream);
        System.setOut(System.out);

        // Define expected output
        String expectedOutput = "No triplets found.";

        // Assert
        assertTrue(outputStreamCaptor.toString().contains(expectedOutput));

    }
}
