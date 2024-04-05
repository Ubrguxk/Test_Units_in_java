import Codes.Median.ConnectTabs;
import Codes.Spiral.SpinMatrix;
import Codes.Triplets.CalculateTriplets;
import Codes.ZigZag.Convert;
import Codes.Algorithms.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Context context = new Context();
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("1. Algorithms - Bubble sort");
            System.out.println("2. Algorithms - Selection sort");
            System.out.println("3. Algorithms - Insertion sort");
            System.out.println("4. Algorithms - Comb sort");
            System.out.println("5. Algorithms - Quick sort");
            System.out.println("6. Zigzag Conversion");
            System.out.println("7. Calculate Median of two tables");
            System.out.println("8. Triplets adding to 0");
            System.out.println("9. Spiral matrix");
            System.out.println("10. Exit");
            String pick = scanner.next();
            switch (pick) {
                case "1":
                    context.setAlgorithm(new BubbleSort());
                    context.executeAlgorithm();
                    break;

                case "2":
                    context.setAlgorithm(new SelectSort());
                    context.executeAlgorithm();
                    break;

                case "3":
                    context.setAlgorithm(new InsertionSort());
                    context.executeAlgorithm();
                    break;

                case "4":
                    context.setAlgorithm(new CombSort());
                    context.executeAlgorithm();
                    break;

                case "5":
                    context.setAlgorithm(new QuickSort());
                    context.executeAlgorithm();
                    break;

                case "6":
                    Convert convert = new Convert();
                    break;

                case "7":
                    ConnectTabs connectTabs = new ConnectTabs();
                    break;

                case "8":
                    CalculateTriplets calculateTriplets = new CalculateTriplets();
                    break;

                case "9":
                    SpinMatrix spinMatrix = new SpinMatrix();
                    break;
                case "10":
                    exit(1);
                    break;
                default:
                    System.out.println("There are no such option");
            }
        }
    }
}