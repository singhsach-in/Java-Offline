package Recursion;

public class PatternREcur {
    public static void main(String[] args) {
        // halfReverseTriangle(10, 0);
        // triangle(51, 51, 0);
        // halfTriangle(10, 0);
        // reverseTriangle(9, 9, 0);
    }

    static void halfReverseTriangle(int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            System.out.print("*");
            halfReverseTriangle(r, c + 1);
        } else {
            System.out.println();
            halfReverseTriangle(r - 1, 0);
        }
    }

    static void halfTriangle(int r, int c) {
        if (r == 0)
            return;
        if (r > c) {
            halfTriangle(r, c + 1);
            System.out.print("*");
            
        } else {
            halfTriangle(r - 1, 0);
            System.out.println();
            
        }
    }

    static void triangle(int r, int c, int i) {
        if (r == 0)
            return;
        if (i >= r && i <= c) {
            System.out.print("*");
            triangle(r, c, i + 1);
        } else if (i < r) {
            System.out.print(" ");
            i++;
            triangle(r, c, i);
        } else {
            System.out.println();
            triangle(r - 1, c + 1, 0);
        }
    }

    
    
}
