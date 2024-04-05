package Codes.Algorithms;

public class QuickSort implements AllAlgorithms {
    static int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = (l - 1);

        for (int j = l; j <= r - 1; j++) {

            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i +1];
        nums[i+1] = nums[r];
        nums[r] = temp;
        return (i + 1);
    }
    public int [] quickSort(int[]nums, int l, int r){
        if(l < r){
            int pi = partition(nums,l,r);
            quickSort(nums,l,pi-1);
            quickSort(nums,pi+1,r);
        }
        return nums;
    }
    @Override
    public int [] sort(int size, int [] nums) {
        int l = 0;
        int r = size - 1;
        // Difrent funtion cause we need to provide l and r
        // To use the recursion
        // And our given sort from interface cant do this
        nums = quickSort(nums,l,r);
        return nums;
    }
}
