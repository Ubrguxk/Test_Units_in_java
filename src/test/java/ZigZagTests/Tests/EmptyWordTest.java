package ZigZagTests.Tests;

import Codes.InputException;
import Codes.ZigZag.Convert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmptyWordTest {
    @Test
    public void emptyWordTest(){
        // Prepare test input
        String simulatedUserInput = "\n";
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
