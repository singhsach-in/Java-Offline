import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) {
        
        try
        {
          //FileOutputStream fo=new FileOutputStream("C:/Users/Sachin/Myjava/MyFile.txt");
          FileWriter fo=new FileWriter("C:/Users/Sachin/Myjava/MyFile.txt");
           String s="Ninja Hatori Aa Gya haii";
          // byte [] b=s.getBytes();
           char[] c= new char[s.length()];
           for(int i=0;i<s.length();i++)
           {
              c[i] = s.charAt(i);
           }
          // fo.write(b);
         //  for(byte x:b)
              // fo.write(x);
          // fo.write(b,6, b.length-6);
         // fo.close();
          fo.write(c);
          fo.close();
        }
        catch(FileNotFoundException e) { System.out.println(e);}
        catch (IOException e) { System.out.println(e);}
        

    }
}
