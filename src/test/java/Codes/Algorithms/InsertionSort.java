package Codes.Algorithms;

public class InsertionSort implements AllAlgorithms {
    @Override
    public int [] sort(int size, int [] nums) {
        for (int i = 1; i < size; ++i){
            int x = nums[i];
            int j = i - 1;
            while(j >= 0  && nums[j] > x){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = x;
        }
        return nums;
    }
}
