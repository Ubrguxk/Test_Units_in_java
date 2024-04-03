package Codes.ZigZag;

import Codes.InputException;

import java.util.Scanner;

/*

    CLASS CONVERT

    A word given by the user will be put in zigzag pattern by size of given rows (as the package name says)
    and read row-by-row to receive the results.

    for example:
    Word = PAYPALISHIRING
    Rows = 3
    Based on that, a matrix will be created, that will be looking like this:
    P               L               I               G
        A       A       I       H       R       N
            P               S               I
    Result is the word read row by row in the matrix

    in this example its: PAHNAPLSIIGYIR

*/
public class Convert {
    int rows;
    String wordInput;
    String wordResult;

    // Constructor which receives input of user and converts the word
    public Convert() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Put the word");
            String userWord = scanner.next();
            System.out.println("Put the number of rows");
            if (!scanner.hasNextInt()) {
                throw new InputException("Number of rows must be an integer.");
            }

            int userRows = scanner.nextInt();

            if (userRows <= 0) {
                throw new InputException("Number of rows must be greater than 0.");
            }

            this.rows = userRows;
            this.wordInput = userWord;
            this.wordResult = getWordResults(userWord, userRows);
        } catch (InputException e) {
            System.err.println("Input error: " + e.getMessage());
        }
    }

    // Reads created matrix to give results
    public String getWordResults(String word, int rows) {
        String results = "";
        String[][] tab = createMatrix(word, rows, word.length());
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < word.length(); k++) {
                if (tab[i][k] != null) { // Modified this line
                    results += tab[i][k]; // Modified this line
                }
            }
        }
        System.out.println(results);
        return results;
    }

    public String[][] createMatrix(String word, int rows, int columns) {
        String[][] tab = new String[rows][columns];
        int j = 0;
        int direction =1;

        for (int i = 0; i < word.length(); i++) {
            tab[j][i] = String.valueOf(word.charAt(i));
            System.out.println(tab[j][i]);
            if(j == 0){direction = 1;}
            else if(j == rows-1){direction = -1;}
            j += direction;
        }
        // this.readMatrix(tab, rows, columns); // Uncomment if necessary
        return tab;
    }
}
