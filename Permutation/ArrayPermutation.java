package Permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ArrayPermutation {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        // 1st WE MAKE LIST TO STORE ALL PERMUTATIONS
        List<List<Integer>> ans = new ArrayList<>();

        // 2nd WE MAKE LIST TO STORE INDIVIDUAL PERMUATION
        List<Integer> al = new ArrayList<>();

        // 3RD WE MAKE A MAP TO CHECK WHETHER A ELEMENT IS TAKE OR NOT
        boolean[] chk = new boolean[nums.length];

        // FUNCTION CALL
        // permutation(ans, al, nums, chk);
        permutFun(ans, 0, nums);

        System.out.println(ans);

    }

    // RECURSIVE METHOD -> TAKES EXTRA SPACE
    private static void permutation(List<List<Integer>> ans, List<Integer> al, int[] nums, boolean[] chk) {
        if (al.size() == nums.length) {
            ans.add(new ArrayList<>(al));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!chk[i]) {
                chk[i] = true;// CHECKS IS ELEMENT IS ALREADY TAKEN IF NOT THEN ADD IT TO TAKEN LIST
                al.add(nums[i]);
                permutation(ans, al, nums, chk);
                chk[i] = false; // REMOVES THE ELEMENT FROM TAKEN LIST
                al.remove(al.size() - 1);
            }
        }

    }

    // RECURSIVE -> NO EXTRA SPACE
    public static void permutFun(List<List<Integer>> ans, int index, int[] nums) {
        if (index == nums.length) {
            List<Integer> al = new ArrayList<>();
            for (int x : nums)
                al.add(x);
            ans.add(new ArrayList<>(al));
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            permutFun(ans, index + 1, nums);
            swap(i, index, nums);
        }
    }

    public static void swap(int a, int b, int[] arr) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    // NO DUPLICATE PERMUTATIONS
    public void permutation(Set<List<Integer>> ansSet, List<Integer> sublist, boolean[] chk, int[] nums) {
        if (sublist.size() == nums.length) {
            ansSet.add(new ArrayList(sublist));//JUST EXTRA SET OF SAME PERMUTATION IS NOT TAKEN AGAIN
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!chk[i]) {
                chk[i] = true;
                sublist.add(nums[i]);
                permutation(ansSet, sublist, chk, nums);
                chk[i] = false;
                sublist.remove(sublist.size() - 1);
            }
        }
    }

}
