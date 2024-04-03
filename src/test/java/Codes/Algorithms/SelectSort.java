package Codes.Algorithms;

public class SelectSort implements AllAlgorithms {
    @Override
    public int [] sort(int size, int [] nums) {
        for(int i = 0; i < size -1; i++){
            int min = nums[i];
            int imin = i;
            for(int j = i + 1; j < size; j++){
                if(nums[j] < min) {
                    min = nums[j];
                    imin = j;
                }
            }
            if (i != imin){
                int temp = nums[i];
                nums[i] = nums[imin];
                nums[imin] = temp;
            }
        }
        return nums;
    }
}
