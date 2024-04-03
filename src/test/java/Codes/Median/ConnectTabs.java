package Codes.Median;
import Codes.Algorithms.SortNumbers;
import Codes.InputException;

import java.util.Scanner;

/*
    CONNECT TABLES  CLASS

    This class allows you to input sizes of two matrices.
    The content of these matrices is randomly generated using the "sortNumber" function.

    Then, these matrices are connected together using "connectTab" and sorted.

    The created matrix is passed to the "findMedian" function and the median is determined.
*/

public class ConnectTabs {
    int [] tab;
    int median;

    // Receiving input from the user and creating random tables. Calls method to connect those and calculate median
    public ConnectTabs(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put the size of tab1");
            if (!scanner.hasNextInt()) {
                throw new InputException("Number of rows must be an integer.");
            }
            int tab1Size = scanner.nextInt();
            if (tab1Size <= 0) {
                throw new InputException("Number of rows must be greater than 0.");
            }
            System.out.println("Put the size od tab2");
            if (!scanner.hasNextInt()) {
                throw new InputException("Number of rows must be an integer.");
            }
            int tab2Size = scanner.nextInt();
            if (tab2Size <= 0) {
                throw new InputException("Number of rows must be greater than 0.");
            }
            int tab1[] = SortNumbers.createNumbers(tab1Size);
            int tab2[] = SortNumbers.createNumbers(tab2Size);
            this.tab = connectTab(tab1, tab2);
            this.median = findMedian(this.tab);
            System.out.println("Median of random tables of this size is: " + this.median);
        }
        catch (InputException e) {
            System.err.println("Input error: " + e.getMessage());
        }
    }

    public int [] connectTab(int [] tab1, int [] tab2){
        int tab[] = new int[tab1.length + tab2.length];

        System.out.println("Table 1: ");
        readTable(tab1);

        System.out.println("Table 2: ");
        readTable(tab2);

        System.arraycopy(tab1, 0,tab,0,tab1.length);
        System.arraycopy(tab2, 0,tab,tab1.length,tab2.length);

        // Using mergesort to sort the matrix to achieve complexity O(log(m+n))
        MergeSort mergeSort = new MergeSort(tab);
        return tab;
    }

    public void readTable(int [] tab){
        for(int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }

    public int findMedian(int [] tab){
        int middle = tab.length / 2;
        if(tab.length % 2 == 1){
            //System.out.println(tab[middle]);
            return tab[middle];
        }
        else{
            return (tab[middle-1] + tab[middle]) / 2;
        }
    }
}
