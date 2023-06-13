package LEETCODE;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        int p = 1;
        int q = 55;
        int x = 5;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = p; i <= q; i++) {
            int sum = 0;
            int num = i;
            while (num > 0) {
                // finds the last digit of the given number
                int digit = num % 10;
                // adds last digit to the variable sum
                sum = sum + digit;
                // removes the last digit from the number
                num = num / 10;
            }
            if (sum == x) {
                if (i < min) {
                    min = i;
                    continue;
                }
            }
            if (sum == x && i > max) {
                max = i;

            }
            System.out.println(min + "  " + max);

        }
    }
}
