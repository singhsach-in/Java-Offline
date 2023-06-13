package Recursion;

import java.util.Arrays;

public class BubbleSortRecur {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 5, 3 };
        BubbleSortRecurFun(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    private static void BubbleSortRecurFun(int[] arr, int i, int j) {

        if(i == 0) return;
         if (j < i) {
            if (arr[j] > arr[j+1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;   
            }
            BubbleSortRecurFun(arr, i, j+1);
         }    
         else         
            BubbleSortRecurFun(arr, i-1, 0);
    }
}
