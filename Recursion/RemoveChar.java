package Recursion;

public class RemoveChar {
    public static void main(String[] args) {
        String s = "234NF23541";
        // String str = s.substring(1);// AT LAST INDEX IF WE ACCESS LAST ELEMENT VIA
                                    // SUBSTRING IT RETURNS EMPTY STRING
        // System.out.println(str);
        System.out.println(removeChar(s, ""));
    }
    // SKIP THE TARGET CHAR AND RETURN THE STRING WITHOUT IT
    private static String removeChar(String og, String nw) {

        if (og.length() == 0)
            return nw;
        if (Character.isDigit(og.charAt(0)))
            return removeChar(og.substring(1), nw);//THUS AT LAST INDEX+1 IT RETURNS EMPTY STRING
        else
            return removeChar(og.substring(1), nw + og.charAt(0));
    }
}
