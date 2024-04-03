package Codes.Spiral;

import Codes.InputException;

import java.util.Random;
import java.util.Scanner;

/* CLASS SPINMATRIX

After imputing the n and m size of the tab, a matrix filled with random numbers is created

Example:
n = 3
m = 4
1   2   3   4
5   6   7   8
9   10  11  12

after spinning the spinned will be:
1 -> 5 -> 9 -> 10 -> 11 -> 12 -> 8 -> 4 -> 3 -> 2 -> 6 -> 7
 */
public class SpinMatrix {
    int n;
    int m;
    int tab[][];
    int spinned[];
    public SpinMatrix(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put the size n of the tab (rows)");
            if (!scanner.hasNextInt()) {
                throw new InputException("Number of rows must be an integer.");
            }
            int n = scanner.nextInt();
            if (n <= 0) {
                throw new InputException("Number of rows must be greater than 0.");
            }
            this.n = n;
            System.out.println("Put the size m of the tab (columns)");
            if (!scanner.hasNextInt()) {
                throw new InputException("Number of rows must be an integer.");
            }
            int m = scanner.nextInt();
            if (m <= 0) {
                throw new InputException("Number of rows must be greater than 0.");
            }
            this.m = m;
            System.out.println("The tab:");
            int tab[][] = createTab(n, m);
            this.tab = tab;
            System.out.println("Spinned:");
            this.spinned = getSpinned(tab, n, m);
        } catch (InputException e) {
            System.err.println("Input error: " + e.getMessage());
        }
    }

    public int[] getSpinned(int [] [] tab,int n, int m) {
        int results[] = new int[n * m];
        int tabSize = n * m;
        int X = 0;
        int Y = 0;
        int j = 0;
        n--;
        m--;

        // Assurance that the word given wont be longer than size of tab
        while (j < tabSize) {

            // from top to down by rows left
            for (int i = Y; i <= n; i++) {
                results[j] = tab[i][X];
                j += 1;
                System.out.print(tab[i][X] + " ");
            }
            // next column
            X++;
            //if bigger than size of tab that means its finished
            if (X > m) break;

            // from left to right by columns down
            for (int i = X; i <= m; i++) {
                results[j] = tab[n][i];
                j += 1;
                System.out.print(tab[n][i] + " ");
            }
            // next row
            n--;
            // if bigger than the size of tab that means its finished
            if (Y > n) break;

            // from bottom to top by rows right
            for (int i = n; i >= Y; i--) {
                results[j] = tab[i][m];
                j += 1;
                System.out.print(tab[i][m] + " ");
            }
            // next row
            m--;
            // if bigger than the size of tab that means its finished
            if (X > m) break;

            // from right to left by columns top
            for (int i = m; i >= X; i--) {
                results[j] = tab[Y][i];
                j+= 1;
                System.out.print(tab[Y][i] + " ");
            }

            // next column
            Y++;
            // if bigger than the size of tab that means its finished
            if (Y > n) break;
        }



        return results;
    }

    public int [][] createTab (int n, int m){
        int tab [][] = new int [n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                Random rand = new Random();
                tab[i][j] = rand.nextInt(100);
                System.out.print(tab[i][j]+ "  ");
            }
            System.out.println();
        }
        //Filling the tab
        return tab;
    }
}
