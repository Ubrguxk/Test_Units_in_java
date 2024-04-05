package AlgorithmsTests.Tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import Codes.Algorithms.QuickSort;
import Codes.Algorithms.Context;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class QuickSortTest {

    // Just quick sort class
    @Test
    public void testQuickSort() {
        // Prepare test data
        int[] arrayToSort = {5, 2, 8, 3, 1};

        // Create an instance of the BubbleSort algorithm
        QuickSort quickSort = new QuickSort();

        // Sort the array using BubbleSort
        quickSort.sort(arrayToSort.length, arrayToSort);

        // Verify that the array is sorted
        assertTrue(isSorted(arrayToSort));
    }

    // Using Context
    @Test
    public void testQuickSortContext() {
        // Prepare test input
        String simulatedUserInput = "10\n";
        InputStream savedStandardInputStream = System.in;
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        Context context = new Context();

        context.setAlgorithm(new QuickSort());
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