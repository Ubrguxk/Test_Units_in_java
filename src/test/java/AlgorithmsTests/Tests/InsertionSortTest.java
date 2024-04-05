package AlgorithmsTests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import Codes.Algorithms.InsertionSort;
import Codes.Algorithms.Context;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class InsertionSortTest {

    // Just inertion sort class
    @Test
    public void testInsertionSort() {
        // Prepare test data
        int[] arrayToSort = {5, 2, 8, 3, 1};

        // Create an instance of the BubbleSort algorithm
        InsertionSort insertionSortTest = new InsertionSort();

        // Sort the array using BubbleSort
        insertionSortTest.sort(arrayToSort.length, arrayToSort);

        // Verify that the array is sorted
        assertTrue(isSorted(arrayToSort));
    }

    // Using Context
    @Test
    public void testInserionSortContext() {
        // Prepare test input
        String simulatedUserInput = "10\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        Context context = new Context();

        context.setAlgorithm(new InsertionSort());
        context.executeAlgorithm();

        int[] nums = context.matrix;

        assertTrue(isSorted(nums));

        // Restore original System.in
        System.setIn(savedStandardInputStream);

    }

    // Helper method to check if an array is sorted
    private boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}