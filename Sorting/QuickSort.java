package Sorting;

import java.util.Arrays;
// NOT STABLE
// TIME COMPLEXITY 
// BEST CASE -> O(NLOGN) , WORST CASE O(N^2)
// NO EXTRA SPACE
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int lo = 0;
        int hi = arr.length-1;
        quickSort(arr, lo, hi);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int lo, int hi) {
        if(lo > hi) return;

        int s = lo;
        int e = hi;
        int m = lo + (hi - lo)/2;
        int p = arr[m];

        while(s <= e) // AFTER THIS LOOP THE PIVET WILL BE AT ITS CORRECT POSITION
        {
            while(arr[s] < p) s++;
            while(arr[e] > p) e--;
            // System.out.println(p+"  "+s+"  "+e);
            if(s <= e)
            {
                int tmp=arr[s];
                arr[s]=arr[e];
                arr[e]=tmp;
                s++; e--;
            }
        }
        quickSort(arr, lo, e);
        quickSort(arr, s, hi);
    }
}

