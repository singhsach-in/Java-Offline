package Recursion;

public class LinearSearchRecur {
    public static void main(String[] args) {
        int[] arr = {123,23,454,667,8,675,54,56,67,33};
        int target = 333;
        System.out.println(LinearSearchRecurFun(arr, target,0));
    }

    private static int LinearSearchRecurFun(int[] arr, int target, int i) {
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;
        return LinearSearchRecurFun(arr, target, i+1);
    }
}
