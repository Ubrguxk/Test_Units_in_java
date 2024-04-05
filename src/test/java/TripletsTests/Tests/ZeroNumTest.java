package TripletsTests.Tests;

import Codes.InputException;
import Codes.Triplets.CalculateTriplets;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ZeroNumTest {
    @Test
    public void zeroNumTest() {
        // Prepare test input
        String simulatedUserInput = "0\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            CalculateTriplets calculateTriplets = new CalculateTriplets();
        });

    }
}
