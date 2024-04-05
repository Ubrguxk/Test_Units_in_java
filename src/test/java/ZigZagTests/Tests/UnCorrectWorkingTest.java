package ZigZagTests.Tests;

import Codes.ZigZag.Convert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnCorrectWorkingTest {
    @Test
    public void unCorrectWorkingTest() {
        // Prepare test input
        String simulatedUserInput = "PAYPALISHIRING\n3\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        Convert converter = new Convert();
        String expected = "AAA";
        assertNotEquals(expected, converter.wordResult);

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

}