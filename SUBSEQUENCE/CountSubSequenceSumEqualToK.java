package SUBSEQUENCE;

import java.util.*;
// --------->>>>>>>>>>>>> PRINT COUNT OF SUB-SEQUENCE WITH SUM EQUAL TO K <<<<<<<<<<<------------------

public class CountSubSequenceSumEqualToK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int k = 3;
        int n = arr.length;
        int index = 0;
        int sum = 0;
        // ArrayList<Integer> al = new ArrayList<>();
        System.out.println(fun(index, n, k, sum, arr));
    }

    private static int fun(int index, int n, int k, int sum, int[] arr) {
        if (sum > k)
            return 0;
        if (index == n) {
            if (sum == k) {
                return 1; // found
            }
            return 0; // not found
        }

        // PICK ELEMENT
        int l = fun(index + 1, n, k, sum + arr[index], arr);

        // NOT PICK ELEMENT
        int r = fun(index + 1, n, k, sum, arr);

        return l + r;

    }

}