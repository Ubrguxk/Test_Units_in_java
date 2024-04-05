package AlgorithmsTests.Tests;

import Codes.Algorithms.BubbleSort;
import Codes.Algorithms.Context;
import Codes.InputException;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContextInputTest {

    // Put zero
    @Test
    public void putZeroTest() {
        // Prepare test input
        String simulatedUserInput = "0\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            Context context = new Context();
            context.setAlgorithm(new BubbleSort());
            context.executeAlgorithm();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }
    // Put -1
    @Test
    public void putMinusTest() {
        // Prepare test input
        String simulatedUserInput = "-1\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            Context context = new Context();
            context.setAlgorithm(new BubbleSort());
            context.executeAlgorithm();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

    // Put not an int
    @Test
    public void putNotIntTest() {
        // Prepare test input
        String simulatedUserInput = "T\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        assertThrows(InputException.class, () -> {
            Context context = new Context();
            context.setAlgorithm(new BubbleSort());
            context.executeAlgorithm();
        });

        // Restore original System.in
        System.setIn(savedStandardInputStream);
    }

}
