package SpiralTests.Tests;

import Codes.InputException;
import Codes.Spiral.SpinMatrix;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ZeroTests {
    // First zero
    @Test
    public void firstZeroInput() {
        // Prepare test input
        String simulatedUserInput = "0\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            SpinMatrix spinMatrix = new SpinMatrix();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

    // Second zero
    @Test
    public void twoZeroInput() {
        // Prepare test input
        String simulatedUserInput = "2\n0\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            SpinMatrix spinMatrix = new SpinMatrix();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

    // first empty
    @Test
    public void firstEmptyInput() {
        // Prepare test input
        String simulatedUserInput = "\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            SpinMatrix spinMatrix = new SpinMatrix();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

    // second empty
    @Test
    public void secondEmptyInput() {
        // Prepare test input
        String simulatedUserInput = "2\n\n";
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
