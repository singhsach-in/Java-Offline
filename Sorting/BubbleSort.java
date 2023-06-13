package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 1, 4 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    // FUNCTION FOR BUBBLE SORT
    static void bubble(int[] arr) {
        boolean isSwapped = false;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
        // AFTER EACH ITERATION MAX VALUE WILL BE AT LAST RESPECTIVE INDEX
            for (int j = 1; j < arr.length - i; j++) {
            // SWAP VALUES IF CURRENT ELEMENT IS SMALLER THAN PREVIOUS
                if (arr[j] < arr[j - 1]) {
                    // SWAP VALUES
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                    isSwapped = true;
                }
            }
            // BREAK IS SWAP DOES NOT HAPPEN
            if (isSwapped == false) {
                break;
            }
        }
    }
}
/*
 * AKA -> SINKING SORT , EXCHANGE SORT , INPLACE SORTING
 * STABLE SORTING
 * TIME COMPLEXITY
 * BEST CASE - O(N) -> ARRAY IS SORTED
 * WORST CASE - O(N^2) -> ARRAY IS OPPOSITILY SORTED
 * SPACE COMPLEXITY -> O(1)
 * USED WHERE :-
 * 1. complexity does not matter
 * 2. simple and shortcode is preferred
 */