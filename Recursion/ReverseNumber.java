package Recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 1827;
        // System.out.println(reverseBYRecur(n));
        int ans = 0;
        ans = reverseBYRecur(n, ans);
        System.out.print(ans);
    }

    static int reverseBYRecur(int n, int ans) {
        if (n % 10 == n) {
            // System.out.print(n);
            ans = ans * 10 + n % 10;
            return ans;
        }
        // System.out.print(n%10);
        ans = ans * 10 + n % 10;
        int retva = reverseBYRecur(n / 10, ans);
        return retva;

    }
}
