package SpiralTests.Tests;

import Codes.Spiral.SpinMatrix;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class CorrectWorkingTest {
    @Test
    public void correctWorkingTest() {
        // Prepare test input
        String simulatedUserInput = "3\n3\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        // Prepare expected output
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        // Run the test
        SpinMatrix spinMatrix = new SpinMatrix();

        // Get Spiraled Matrix
        int[][] spinnedMatrix = spinMatrix.getTab();

        // Expected output
        int[] expectedSpin = calculateExpectedSpin(spinnedMatrix);

        // Restore original System.in
        System.setIn(savedStandardInputStream);

        // Assert
        assertArrayEquals(expectedSpin, spinMatrix.spinned);

    }
    int[] calculateExpectedSpin(int[][] spinnedMatrix) {
        int n = spinnedMatrix.length;
        int m = spinnedMatrix[0].length;
        int totalElements = n * m;
        int[] res = new int[totalElements];

        int X = 0, Y = 0;
        int idx = 0;
        n--;
        m--;

        while (idx < totalElements) {
            // from top to down by rows left
            for (int i = Y; i <= n; i++) {
                res[idx++] = spinnedMatrix[i][X];
            }
            X++;
            if (X > m) break;

            // from left to right by columns down
            for (int i = X; i <= m; i++) {
                res[idx++] = spinnedMatrix[n][i];
            }
            n--;
            if (Y > n) break;

            // from bottom to top by rows right
            for (int i = n; i >= Y; i--) {
                res[idx++] = spinnedMatrix[i][m];
            }
            m--;
            if (X > m) break;

            // from right to left by columns top
            for (int i = m; i >= X; i--) {
                res[idx++] = spinnedMatrix[Y][i];
            }
            Y++;
            if (Y > n) break;
        }
        return res;
    }
}

