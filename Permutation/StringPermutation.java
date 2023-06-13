package Permutation;

import java.util.ArrayList;

public class StringPermutation { // TOTAL PERMUTATION -> N!
    public static void main(String[] args) {
        String s = "123";
        System.out.println(stringPermutation(s, ""));

    }

    // USING RECURSION
    private static ArrayList<String> stringPermutation(String og, String nw) {

        if (og.isEmpty()) {
            ArrayList<String> al = new ArrayList<>();
            al.add(nw);
            return al;
        }
        ArrayList<String> al = new ArrayList<>();
        char ch = og.charAt(0);
        for (int i = 0; i <= nw.length(); i++) {
            String f = nw.substring(0, i);
            String s = nw.substring(i, nw.length());
            al.addAll(stringPermutation(og.substring(1), f + ch + s));
        }
        return al;
    }
}
