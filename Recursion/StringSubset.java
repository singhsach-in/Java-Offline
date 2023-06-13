package Recursion;

import java.util.ArrayList;

public class StringSubset {
    public static void main(String[] args) {
        String og = "abc";
        // stringSubseq("",s);
        System.out.println(stringSubseqRet("", og));
    }

    private static void stringSubseq(String pro,String og) {
        if(og.isEmpty())
        {
            System.out.println(pro); return;
        }

        char ch = og.charAt(0);
        stringSubseq(pro+ch, og.substring(1));
        stringSubseq(pro, og.substring(1));
    }

    private static ArrayList<String> stringSubseqRet(String pro,String og) {
        if(og.isEmpty())
        {
            ArrayList<String> al = new ArrayList<>();
            al.add(pro);
            return al;
        }

        char ch = og.charAt(0);
        ArrayList<String> first  = stringSubseqRet(pro+ch, og.substring(1));
        ArrayList<String> second = stringSubseqRet(pro, og.substring(1));

        first.addAll(second);
        return first;
    }
}
