import java.util.Scanner;

class Basic {

    // -------- ARMSTRONG NUMBER ------------
    static boolean isArmstrong(int n) {
        int tmp = n, rem = 0, sum = 0, digits = 0;
        while (tmp > 0) {
            tmp /= 10;
            digits++;
        }
        tmp = n;
        while (tmp > 0) {
            rem = tmp % 10;
            sum += Math.pow(rem, digits);
            tmp /= 10;
        }
        if (n == sum)
            return true;
        return false;
    }

    // ---------- PERFECT SQUARE --------------
    static boolean isPerfectSquare(double n) {
        double sqrt = Math.sqrt(n);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    // ---------- PRIME NUMBER --------------
    static void isPrime(int n) {
        if (n <= 1)
            System.out.println(n + " is not a Prime Number.");
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a Prime Number.");
                return;
            }
        }
        System.out.println(n + " is a Prime Number.");
    }

    static boolean isPalin(int i, String s) {
        if (i >= s.length() / 2)
            return true;
        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;
        return isPalin(i + 1, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // -------- ARMSTRONG NUMBER ------------
        // int n = sc.nextInt();
        // System.out.println(n+" is armstrong number: "+isArmstrong(n));

        // ---------- PERFECT SQUARE --------------
        // double n = sc.nextDouble();
        // System.out.println(n+" is perfect Square: "+isPerfectSquare(n));

        // ---------- FIBONACCI SERIES --------------
        // int n = sc.nextInt();
        // int x=0, y=1, z=0;
        // System.out.print(x+" "+y+" ");
        // for(int i=2; i<n; i++)
        // {
        // z = x+y;
        // System.out.print(z+" ");
        // x=y;
        // y=z;
        // }

        // ---------- FACTORIAL --------------
        // int n = sc.nextInt();
        // int res=1;
        // while(n != 1)
        // {
        // res *= n;
        // n--;
        // }
        // System.out.println(res);

        // ---------- PRIME NUMBER --------------
        // int n = sc.nextInt();
        // isPrime(n);

        // ---------- REVERSE STRING ------------
        // String str = sc.nextLine();
        // String str2 = "";
        // for(int i=str.length()-1; i>=0; i--)
        // {
        // str2 += str.charAt(i);
        // }
        // System.out.println(str2);
        // System.out.println(str.equals(str2));

        // -------------- REVERSE STRING -> RECURSION ------------
        String s = "otteo";
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);

        // ---------- PALINDROME NUMBER------------
        // int n = sc.nextInt();
        // int tmp=n, rem=0, sum=0;
        // while(tmp !=0) {
        // rem = tmp%10;
        // sum = (sum*10) + rem;
        // tmp /= 10;
        // }
        // if(sum == n) System.out.println(n+" is Palindrome.");
        // else System.out.println(n+" is not Palindrome.");

        // ---------------- PALINDROME STRING -> RECURSION -> using one variable
        // --------
        // System.out.println(isPalin(0, "ottor"));

        // LENGTH OF A STRING WITHOUT LENGTH FUNCTION
        String str = "sampleString";
        int i = 0;
        for (char c : str.toCharArray()) {
            i++;
        }
        System.out.println("Length of the given string ::" + i);

    }
}