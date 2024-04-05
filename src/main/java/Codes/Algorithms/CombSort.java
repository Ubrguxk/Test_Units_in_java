package Codes.Algorithms;

public class CombSort implements AllAlgorithms {
    int getNextGap(int gap){
        gap = (gap * 10 ) / 13;
        if(gap == 9 || gap == 10) gap = 11;
        if(gap < 1) gap = 1;
        return gap;
    }
    @Override
    public int [] sort(int size, int [] nums) {
        int gap = size;
        boolean swapped = true;

        while(gap != 1 || swapped == true){
            gap = getNextGap(gap);
            swapped = false;

            for(int i = 0; i < size - gap; i++){
                if(nums[i] > nums[i + gap]){
                    int temp = nums[i];
                    nums[i] = nums[i+gap];
                    nums[i+gap] = temp;

                    swapped = true;
                }
            }
        }

        return nums;
    }
}
