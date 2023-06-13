public class ExceptionHandling2 {
     public static void main(String[] args) {
         
        int A[]={23,43,1234,5,23,0};
        /*
        try
        {
            int b=A[0]/A[3];
            System.out.println("DIVISION IS :"+b);

            System.out.println(A[10]);

        }
        catch(ArithmeticException e)
        {
            System.out.println("DENO MUST NOT BE ZERO\nTRY AGAIN");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("INVALID INDEX NUMBER\nTRY AGAIN");
        }
        */
        try
        {   
            try
            {
            int b=A[0]/A[5];
            System.out.println("DIVISION IS :"+b);
            }
            catch(ArithmeticException e)
            {
                System.out.println("DENO MUST NOT BE ZERO\nTRY AGAIN");
            }
                System.out.println(A[1]);
        }
            catch(ArrayIndexOutOfBoundsException e)
            {
            System.out.println("INVALID INDEX NUMBER\nTRY AGAIN");
            }
       
            System.out.println("THIS IS THE END");
     }
}
