import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
    public static void main(String[] args) {
        try
        {
            //FileInputStream fi=new FileInputStream("C:/Users/Sachin/Myjava/MyFile.txt");
            FileReader fr=new FileReader("C:/Users/Sachin/Myjava/MyFile.txt");
            //byte[] b=new byte[fi.available()];
           // fi.read(b); takes arrayByte and store bytes in it
        
            //String s=new String(b);
           // System.out.println(s);
           
           int x;
           
           
           while((x=fr.read())!=-1) //returns int by int
           {
               System.out.print((char)x);
           } 
           fr.close();
           
         
        }
        catch(FileNotFoundException e){ System.out.println(e);}
        catch(IOException e) { System.out.println(e);}
    }
}
