package Codes.Algorithms;

import Codes.InputException;

import java.util.Arrays;
import java.util.Scanner;

/*
    CONTEXT CLASS

    Allows us to implement the design pattern "Strategist"

    When an instance of this class is created, desired algorithm is provided.
    Then an "executeAlgorithm" can be called. A matrix of size given is filled with random numbers.
    Method types back:
    - Pessimistic time
    - Optimistic time
    - Realistic time
    of the given algorithm

 */
public class Context {
    private AllAlgorithms allAlgorithms;

    public void setAlgorithm(AllAlgorithms allAlgorithms){
        this.allAlgorithms = allAlgorithms;
    }

    public void executeAlgorithm(){
        long tStart, tEnd, tDelta;
        int size = 0;
        double elapsedSeconds;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put the size of sorted matrix");
            if (!scanner.hasNextInt()) {
                throw new InputException("Number of rows must be an integer.");
            }
            size = scanner.nextInt();
            if (size <= 0) {
                throw new InputException("Number of rows must be greater than 0.");
            }
        }
        catch (InputException e) {
            System.err.println("Input error: " + e.getMessage());
        }

        //Prepare table reversed for pessimistic order
        int [] nums = SortNumbers.createNumbers(size);
        Arrays.sort(nums);
        int [] reversedNums = new int[size];
        for(int i = size - 1, j = 0; i >= 0; i--){
            reversedNums[j] = nums[i];
            j++;
        }

        // Calling sort Algorithm
        tStart = System.currentTimeMillis();
        allAlgorithms.sort(size, reversedNums);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("Pessimistic sorting time: " + elapsedSeconds);

        // Prepare table for realistic order
        nums = SortNumbers.createNumbers(size);

        // Calling sort Algorithm
        tStart = System.currentTimeMillis();
        allAlgorithms.sort(size, nums);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("Realistic sorting time: " + elapsedSeconds);

        // Use already sorted table from before for optimistic time and Call sort
        tStart = System.currentTimeMillis();
        allAlgorithms.sort(size, nums);
        tEnd = System.currentTimeMillis();
        tDelta = tEnd - tStart;
        elapsedSeconds = tDelta / 1000.0;

        System.out.println("Optimistic sorting time: " + elapsedSeconds);

    }
}
