package Codes.Algorithms;

public class BubbleSort implements AllAlgorithms {
    @Override
    public int [] sort(int size, int [] nums) {
        int i = -1;
        int j;
        boolean ifSwap;
        do {
            //Sort from back
            ifSwap = false;
            for( ++i ,j = size-1; j > i; --j){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    ifSwap = true;
                }
            }
        }
        while(ifSwap);
        return nums;
    }
}
