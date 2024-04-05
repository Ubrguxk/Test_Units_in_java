package Codes.Triplets;

import Codes.InputException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//CALCULATE TRIPLETS CLASS
/*

 */
public class CalculateTriplets {
    public CalculateTriplets(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("How many numbers will be put?");
            if (!scanner.hasNextInt()) {
                throw new InputException("Number of rows must be an integer.");
            }
            int numsNumb = scanner.nextInt();
            if (numsNumb <= 0) {
                throw new InputException("Number of rows must be greater than 0.");
            }
            int tab[] = new int[numsNumb];
            for (int i = 0; i < numsNumb; i++) {
                System.out.println("Put number");
                tab[i] = scanner.nextInt();
            }
            findTiplets(tab);
    }

    public void findTiplets(int tab[]){
        // Stored already existing triples
        ArrayList<int[]> stored = new ArrayList<int[]>();
        System.out.println("All the triplets:");
        // first of the triplets
        for(int i = 0; i < tab.length; i++){
            // second of the triplets

            for(int j = i + 1; j < tab.length;j++){
                // third of the triplets

                for(int k = j + 1; k < tab.length;k++){

                    //System.out.println(tab[i] + " " + tab[j] + " " +tab[k]);

                    if( tab[i] + tab[j] + tab[k] == 0){

                        int[] added;
                        added = new int[]{tab[i],tab[j],tab[k]};
                        Arrays.sort(added);
                        if(!isTripletStored(stored,added)) {
                            stored.add(added);
                            System.out.println(Arrays.toString(added));
                        }
                    }
                }
            }
        }
        if(stored.isEmpty()){
            System.out.println("No triplets found.");
        }
    }

    public static boolean isTripletStored(ArrayList<int[]> stored, int [] added){
        //checking for every tab in stored
        for (int[] t : stored) {
            if (Arrays.equals(t, added)) {
                return true;
            }
        }
        return false;
    }

}
