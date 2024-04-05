package ZigZagTests.Tests;

import Codes.ZigZag.Convert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleRowTest {
    @Test
    public void singleRowTest() {
        // Prepare test input
        String simulatedUserInput = "PAYPALISHIRING\n1\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        Convert converter = new Convert();
        String expected = "PAYPALISHIRING";
        assertEquals(expected, converter.wordResult);

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }
}
