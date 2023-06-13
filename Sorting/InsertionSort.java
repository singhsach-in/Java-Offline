package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,6,12,4,30,18};
        //WITH EVERY ITERATION THE LEFTMOST PART WILL BE SORTED
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void swap( int[] arr ,int a , int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        
    }
    static void insertion(int[] arr)
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    swap(arr,j,j-1); 
                    System.out.println("xxx");
                }
                else 
                {
                    break;
                }
            }
        }
    }
}
/*
    STABLE SORTING
    TIME COMPLEXITY
    BEST CASE -> O(N)
    WORST CASE -> O(N^2)
    STEPS GET REDUCED IF ARRAY IS PARTIALLY SORTED
    BUT BETTER THAN BUBBLE SORT BCOZ THE NUMBER OF COMPARISIONS ARE LESS
    USED FOR SMALLER VALUES OF N (TAKES PART IN HYBRID SORTING ALGO)

*/
