package Recursion;

import javax.lang.model.element.Element;

public class RotatedBinarySearchRecur {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 7;
        // 1 WAY
        // int max = -1;
        // for(int i=0; i<arr.length-1; i++)
        // {
        //     if( arr[i] > arr[i+1] ) { max = i ; break ;}
        // }
        // int start=0, end = arr.length-1;
        // int mid = start + (end - start)/2;
        // if(target > arr[end]) System.out.println(RotatedBinarySearchRecurFun(arr, target, 0, max));
        // if(target < arr[start])System.out.println(RotatedBinarySearchRecurFun(arr, target, max, arr.length-1));

        // 2ND WAY
        System.out.println(RotatedBinarySearchRecurFun(arr, target, 0, arr.length-1));
    }

    private static int RotatedBinarySearchRecurFun(int[] arr, int target, int start, int end) {
        if(start > end) return-1;
        int mid = start + (end - start)/2;

        // 1 WAY
        // if(arr[mid] == target)return mid;
        // if(target > arr[mid]) return RotatedBinarySearchRecurFun(arr, target, mid+1, end);
        // else return RotatedBinarySearchRecurFun(arr, target, start, mid-1);

        // 2ND WAY
        if(target == arr[mid]) return mid;
        if(arr[start] <= arr[mid] )
        {
            if(target >= arr[start] && target <= arr[mid])
            return RotatedBinarySearchRecurFun(arr, target, start, mid-1);
            else
            return RotatedBinarySearchRecurFun(arr, target, mid+1, end);
        }
        else if(target >= arr[mid] && target <= arr[end])
        {
            return RotatedBinarySearchRecurFun(arr, target, mid+1, end);
        }
        else 
        return RotatedBinarySearchRecurFun(arr, target, start, mid-1);
    }
}
