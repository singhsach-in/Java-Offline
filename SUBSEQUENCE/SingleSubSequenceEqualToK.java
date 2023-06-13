package SUBSEQUENCE;

import java.util.*;
 // --------->>>>>>>>>>>>> PRINT ONE/ANY SUB-SEQUENCE WITH SUM EQUAL TO K <<<<<<<<<<<------------------

public class SingleSubSequenceEqualToK {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int k = 2;
        int n = arr.length;
        int index = 0;
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        fun(index, n, k, sum, al, arr);
    }

    private static boolean fun(int index, int n, int k, int sum, ArrayList<Integer> al, int[] arr) {
        if (index == n) {
            if (sum == k) {
                for (int x : al)
                    System.out.print(x + " ");
                return true; // found
            }
            return false; // not found
        }

        al.add(arr[index]);
        sum += arr[index];

        // PICK ELEMENT
        if (fun(index + 1, n, k, sum, al, arr) == true)
            return true;

        al.remove(al.size() - 1);
        sum -= arr[index];

        // NOT PICK ELEMENT
        if (fun(index + 1, n, k, sum, al, arr) == true)
            return true;

        return false;

    }

}
