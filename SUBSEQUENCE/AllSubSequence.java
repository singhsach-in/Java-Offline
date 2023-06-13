package SUBSEQUENCE;

import java.util.ArrayList;
// ----------------------->>>>>> PRINT ALL SUB-SEQUENCES <<<<<----------------------------------
public class AllSubSequence {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        int n = 3;
        ArrayList<Integer> al = new ArrayList<>();
        fun(0, n, al, arr);
    }

    static void fun(int index, int n, ArrayList<Integer> al, int[] arr) {

        if (index == n) {
            if(al.isEmpty()) System.out.print("[]");
            else
            for(int x : al) System.out.print(x+" ");
            System.out.println();
            return;
        }

        al.add(arr[index]);
        // TAKE ELEMENT
        fun(index + 1, n, al, arr);
        al.remove(al.size() - 1);
        // NOT TAKE ELEMEMNT
        fun(index + 1, n, al, arr);
    }

}
