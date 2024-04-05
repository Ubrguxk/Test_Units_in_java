package ZigZagTests.Tests;

import Codes.ZigZag.Convert;
import org.junit.Test;
import Codes.InputException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmptyRowsTest {
    @Test
    public void emptyRowsTest(){
        // Prepare test input
        String simulatedUserInput = "PAYPALISHIRING\n0\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            Convert converter = new Convert();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }
}
