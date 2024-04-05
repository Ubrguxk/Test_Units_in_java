package MedianTests.Tests;

import Codes.InputException;
import Codes.Median.ConnectTabs;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ZeroTests {
    @Test
    public void firstEmptyTest() {
        // Prepare test input
        String simulatedUserInput = "\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        assertThrows(InputException.class, () -> {
            ConnectTabs connectTabs = new ConnectTabs();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

    @Test
    public void secondEmptyTest() {
        // Prepare test input
        String simulatedUserInput = "2\n\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        assertThrows(InputException.class, () -> {
            ConnectTabs connectTabs = new ConnectTabs();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }
    @Test
    public void firstZeroTest() {
        // Prepare test input
        String simulatedUserInput = "0\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        assertThrows(InputException.class, () -> {
            ConnectTabs connectTabs = new ConnectTabs();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

    @Test
    public void secondZeroTest() {
        // Prepare test input
        String simulatedUserInput = "2\n0\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        assertThrows(InputException.class, () -> {
            ConnectTabs connectTabs = new ConnectTabs();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }
}
