import java.util.Scanner;

public class ExceptionHandlin {
    public static void main(String[] args) {
        
        int a,b,c;
        System.out.println("ENTER TWO NUMBERS");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        try  // try block
        {
        c=a/b;
        System.out.println("DIVISION IS : "+c);
        }
        catch(ArithmeticException e) // catch block
        {
            System.out.println("DENOMINATOR MUST NOT BE ZERO\nTRY AGAIN (++)");
        }
        System.out.println("THIS IS THE END ^_^");
    }
    
}
