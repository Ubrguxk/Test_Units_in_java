package SpiralTests.Tests;

import Codes.InputException;
import Codes.Spiral.SpinMatrix;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SizesTests {

    // for size 1:1
    @Test
    public void firstStringInput() {
        // Prepare test input
        String simulatedUserInput = "1\n1\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Run the test
        SpinMatrix spinMatrix = new SpinMatrix();


        // Get Spiraled Matrix
        int[][] spinnedMatrix = spinMatrix.getTab();

        // Get spinned Matrix
        int[] expectedSpin = spinMatrix.getSpin();

        // Restore original System.in
        System.setIn(savedStandardInputStream);

        // Verify the output
        int[] expectedMatrix = {expectedSpin[0]};
        assertArrayEquals(expectedMatrix, spinnedMatrix[0]);
    }

}
