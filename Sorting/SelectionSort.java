package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};

        for(int i=0; i<arr.length; i++)
        {
            int last = arr.length-i-1; //LAST RESPECTIVE INDEX
            int maxIndex = getMaxIndex(arr,0,last); //MAX INDEX
            swap(arr,maxIndex,last); // SWIFTING RESPECTIVE MAX VALUE TO THE RESPECTIVE LAST INDEX
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap( int[] arr ,int a , int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
        System.out.println("xxx");
    }
    static int getMaxIndex(int[] arr , int start , int end )
    {
        int max=start;
        //SEARCHING FOR MAX ELEMENT AND STORING ITS INDEX
        for(int i=start; i<=end; i++)
        {
            if(arr[i] > arr[max])
            {
                max=i; 
            }
        }
        return max;
    }
}
/*
    UNSTABLE SORTIG
    TIME COMPLEXITY
    BEST CASE -> O(N^2)
    WORST CASE -> O(N^2)
    SPACE TIME COMPLEXITY O(1)
    USED WHERE :-
    1. A small array is to be sorted
    2. Swapping cost doesn't matter
    3. It is compulsory to check all elements
*/
