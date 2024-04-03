package Codes.Algorithms;
import java.util.Random;
public class SortNumbers{
    public static int[] createNumbers(Integer size){
        int [] numbers;
        numbers = new int[size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            numbers[i] = rand.nextInt(1000);
            //System.out.println(numbers[i]);
        }

        return numbers;
    }
}
