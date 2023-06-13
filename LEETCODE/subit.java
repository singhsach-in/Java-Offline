package LEETCODE;



import java.util.*;

public class subit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i < n; i++)
        arr[i] = sc.nextLong();
        int index = n-m;
        System.out.println(printAll(arr, 0, index ));
    }

    public static long printAll(long[] arr, long sum, int index) {

        if(index == arr.length) return sum;
            sum += arr[index];
          return  printAll(arr, sum, index+1);      
    }
}