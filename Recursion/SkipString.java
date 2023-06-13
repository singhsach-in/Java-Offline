package Recursion;

public class SkipString {
    public static void main(String[] args) {
        String og = "aabcdapplemmdapploaapleaappleqq";
        System.out.print(skipString2(og, ""));
    }

    private static String skipString(String og, String nw) { // SKIP APPLE

        if (og.isEmpty())
            return nw;
        if (og.startsWith("apple"))
            return skipString(og.substring(5), nw);
        else
            return skipString(og.substring(1), nw + og.charAt(0));
    }

    private static String skipString2(String og, String nw) { // SKIP APPLE

        if (og.isEmpty())
            return nw;
        if (og.startsWith("app") && !og.startsWith("apple"))
            return skipString2(og.substring(3), nw);
        else
            return skipString2(og.substring(1), nw + og.charAt(0));
    }
}
