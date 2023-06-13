package Recursion;

public class CheckForSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,4,5,6,7}; 
        int n = arr.length-1;
        System.out.println(CheckForSortFun(arr,n,0));
    }

    private static boolean CheckForSortFun(int[] arr, int n,int index) {
        if(index == n) return true;
        return arr[index] < arr[index+1] && CheckForSortFun(arr, n, index+1);
    }
}
