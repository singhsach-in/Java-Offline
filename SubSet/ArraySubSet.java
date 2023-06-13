package SubSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySubSet {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        // ArrayList<ArrayList<Integer>> all = arraySubsetDuplicates(arr);
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<ArrayList<Integer>> all = new ArrayList<>();
        arraySubsetRecur(al, 0, arr, all);
        System.out.println(all);

    }

    // ITERATIVE METHOD FOR SUBSETS OF ARRAY
    private static ArrayList<ArrayList<Integer>> arraySubset(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());// blank list
        for (int x : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(x);
                outer.add(inner);

            }
        }
        return outer;
    }

    // ITERATIVE METHOD FOR SUBSETS WITHUT DUPLICATES OF ARRAY
    private static ArrayList<ArrayList<Integer>> arraySubsetDuplicates(int[] arr) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());// blank list
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = outer.size();
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1])
                start = end + 1;// start will be preious end + 1
            end = outer.size() - 1;

            for (int j = start; j < n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);

            }
        }
        return outer;

    }

    // RECURSIVE METHOD TO FIND SUBSET
    private static void arraySubsetRecur(ArrayList<Integer> al, int i, int[] nums, ArrayList<ArrayList<Integer>> all) {
        // base condition
        if (i == nums.length) {
            all.add(new ArrayList<>(al));
            return;
        }

        // IF WE DONT TAKE THE ELEMEMNT
        arraySubsetRecur(al, i + 1, nums, all);

        // IF WE TAKE THE ELEMEMNT
        al.add(nums[i]);
        arraySubsetRecur(al, i + 1, nums, all);

        // Removing pewvious elements
        al.remove(al.size() - 1);

    }

    // BIT MANIPULATION WITHITERATIVE FOR SUBSET OF ARRAY
    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> all = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> al = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0)
                    al.add(nums[j]);
            }
            all.add(al);
        }
        return all;
    }

}
