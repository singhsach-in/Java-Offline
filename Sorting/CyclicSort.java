package Sorting;

import java.util.Arrays;
//WHEN GIVEN NUMBERS ARE FROM 1 TO N -> USE CYCLIC SORT💯
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,8,2,3,5,7,6,4}; //NUMBERS SHOULD BE CONTINOUS FROM 1 TO N 💯
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            //CHECKING IS ELEMENT IS AT ITS CORRECT INDEX
            if(i != arr[i]-1)
            {
                swap(arr,i,arr[i]-1);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap( int[] arr ,int a , int b)
    {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;     
    }
}
/*
    UNSTABLE SORTING
    TIME COMPLEXSITY
    BEST CASE -> O(N)
    WORST CAE -> O(N) 💯
    USED :-
    1. WHEN GIVEN NUMBERS ARE FROM 1 TO N -> USE CYCLIC SORT💯
    2. NUMBERS SHOULD BE CONTINOUS FROM 1 TO N 💯
*/
