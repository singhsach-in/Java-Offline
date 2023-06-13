package Searching;

public class BinarySearchRecur {
    public static void main(String[] args) {
        int[] arr = {1, 2,  33, 45, 55, 67, 88, 89, 90};
        int target = 90;
        System.out.println(BinarySearch(arr, target, 0, arr.length-1));
    }
    static int BinarySearch(int[] arr, int target, int start, int end)
    {
        if(start > end) return -1;
        int mid = start +(end-start)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target) return BinarySearch(arr, target, start, mid-1);
        else
        return BinarySearch(arr, target, mid+1, end);
    }
}


