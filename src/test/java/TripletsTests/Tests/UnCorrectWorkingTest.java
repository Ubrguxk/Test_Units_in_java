package TripletsTests.Tests;

import Codes.Triplets.CalculateTriplets;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;

public class UnCorrectWorkingTest {
    @Test
    public void unCorrectWorkingTest() {
        // Prepare test input
        String simulatedUserInput = "6\n-1\n0\n\n1\n2\n-1\n-4";
        InputStream savedStandardInputStream = System.in;
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
        String expectedOutput = "[-4, -4, -4]";

        // Assert
        assertFalse(outputStreamCaptor.toString().contains(expectedOutput));

    }
}
