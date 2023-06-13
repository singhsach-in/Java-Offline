package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;
// TIME COMPEXITY -> O(NLOGN) , SPACE -> O(N)
public class MergeSort {    // TWO WAYS OF DOING
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 32, 5, 4332, 45, 54, 232, 6 };
        int n = arr.length;
        int left = 0;
        int right = n - 1;
//        MSort(arr, left, right);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(mergeSort(arr)));
        int mid = (left+right)/2;
//        System.out.println(Arrays.toString(MSort(arr, left, right)));
        MSort(arr, left, right);
        System.out.println(Arrays.toString(arr));
    }
    // ONE WAY -> INPLACE SORTING
    static void MSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            MSort(arr, left, mid);
            MSort(arr, mid + 1, right);
            Merge(arr, left, mid, right);
        }
    }
    private static int[] Merge(int[] arr, int left, int mid, int right ) {
        int[] b = new int[right + 1];
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++; 
        }
            while (j <= right) {
                b[k] = arr[j];
                j++;
                k++;    
            } 
            while (i <= mid) {
                b[k] = arr[i];
                i++;
                k++;
            }
        // if (right + 1 - left >= 0) System.arraycopy(b, left, arr, left, right + 1 - left);
        for(k=left; k<=right; k++){
            arr[k] = b[k];
        }
        return arr;
    }
    // SECOND WAY
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int i = 0;// pointer for left;
        int j = 0;// pointer for rigth;
        int k = 0;// pointer for new array arr
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }
        return arr;
    }

}
