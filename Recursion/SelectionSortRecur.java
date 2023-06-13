package Recursion;

import java.util.Arrays;

public class SelectionSortRecur {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 5, 4, 6, -23, 452, -654, 0, 23412, 0, 1, 2, 3, 55, -876, -7437, 65, 23 };
        SelectionSortRecurFun(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        SelectionSortRecurFun2(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    // 1 WAY
    private static void SelectionSortRecurFun(int[] arr, int i, int last) {
        if (last == 0)
            return;
        int getMaxIndex = get(arr, last, Integer.MIN_VALUE, i, -1);
        swap(arr, getMaxIndex, last);
        SelectionSortRecurFun(arr, i, last - 1);
    }

    static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    private static int get(int[] arr, int last, int max, int j, int index) {
        if (j > last)
            return index;
        if (arr[j] > max) {
            index = j;
            max = arr[j];
        }
        return get(arr, last, max, j + 1, index);
    }

    // 2ND WAY
    static void SelectionSortRecurFun2(int[] arr, int i, int j, int max) {
        if (i == 0)
            return;
        if (j <= i) {
            if (arr[j] > arr[max]) {
                max = j;
                SelectionSortRecurFun2(arr, i, j + 1, max);
            }

            else
                SelectionSortRecurFun2(arr, i, j + 1, max);
        } else {
            int tmp = arr[max];
            arr[max] = arr[i];
            arr[i] = tmp;
            SelectionSortRecurFun2(arr, i - 1, 0, 0);
        }
    }
}
