package Codes.Median;

// WARNING
// This class is not with other algorithms because in AllAlgorithm when you want to call the sort
// there will be printed optimistic, realistic and pessimistic time of the sorting
// I did not want those so only for this task i made a diffrent class

public class MergeSort {
    public MergeSort(int [] tab){
        sorting(tab, 0, tab.length - 1);
    }
    private void sorting(int [] tab, int low, int high){
        if(low < high){
            int mid = low + (high - low) / 2;

            sorting(tab, low, mid);
            sorting(tab, mid + 1, high);

            merge(tab, low, mid, high);
        }
    }

    private void merge(int [] tab, int low, int mid, int high){
        int leftLength = mid - low + 1;
        int rightLength = high - mid;

        int [] leftArray = new int[leftLength];
        int [] rightArray = new int[rightLength];

        for(int i = 0; i < leftLength; i++)
            leftArray[i] = tab[low + i];
        for(int j = 0; j < rightLength; j++)
            rightArray[j] = tab[mid + 1 + j];

        int i = 0, j = 0, k = low;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] <= rightArray[j]){
                tab[k] = leftArray[i];
                i++;
            } else {
                tab[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i < leftLength){
            tab[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < rightLength){
            tab[k] = rightArray[j];
            j++;
            k++;
        }
    }
}