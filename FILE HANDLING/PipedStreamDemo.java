import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Creater extends Thread //write
{  
   OutputStream os;
   public Creater(OutputStream os) { this.os=os;}
   public void run()
    {
       int count=1;
       while(true)
       {
         try
         {
            os.write(count);
            os.flush();

            System.out.println("Creater : "+count);
            System.out.flush();
            Thread.sleep(1000);
            count++;
        
         }catch(Exception e) {}
        
        }

    }  
}
class Eater extends Thread //Read
{
    InputStream is;
    public Eater(InputStream is) { this.is=is; }

    public void run()
    {   
        int x;
        while(true)
        {   
            try
            {
              x=is.read();
              
              System.out.println("Eater : "+x);
              System.out.flush();
              Thread.sleep(1000);
            
            } catch(Exception e) {}
          
            
        }
    
    }

    

}

public class PipedStreamDemo {
    public static void main(String[] args) throws Exception{
        
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        pis.connect(pos);

        Creater c=new Creater(pos);
        Eater e=new Eater(pis);

        c.start();
        e.start();
    }
}
