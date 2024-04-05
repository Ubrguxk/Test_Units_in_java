package SpiralTests.Tests;

import Codes.InputException;
import Codes.Spiral.SpinMatrix;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class UncorrectVariableTest {
    // First string
    @Test
    public void firstStringInput() {
        // Prepare test input
        String simulatedUserInput = "A\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            SpinMatrix spinMatrix = new SpinMatrix();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

    // Second string
    @Test
    public void twoStringInput() {
        // Prepare test input
        String simulatedUserInput = "2\nT\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            SpinMatrix spinMatrix = new SpinMatrix();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }
}
