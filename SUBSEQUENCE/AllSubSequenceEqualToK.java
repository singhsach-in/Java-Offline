package SUBSEQUENCE;

import java.util.*;
// --------->>>>>>>>>>>>> PRINT ALL SUB-SEQUENCE WITH SUM EQUAL TO K  <<<<<<<<<<<<<<<------------------
class AllSubSequenceEqualToK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1 };
        int k = 2;
        int n = arr.length;
        int index = 0;
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        fun(index, n, k, sum, al, arr);

    }

    private static void fun(int index, int n, int k, int sum, ArrayList<Integer> al, int[] arr) {
        if (index == n) {
            if (sum == k) {
                for (int x : al)
                    System.out.print(x + " ");
                System.out.println();
            }
            return;
        }

        al.add(arr[index]);
        sum += arr[index];

        // PICK ELEMENT
        fun(index + 1, n, k, sum, al, arr);

        al.remove(al.size() - 1);
        sum -= arr[index];

        // NOT PICK ELEMENT
        fun(index + 1, n, k, sum, al, arr);

    }

}