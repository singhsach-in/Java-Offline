import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student11 implements Serializable//must implement
{
    int RollNo;
    String Name;
    String Dept;
    float Avg;
    public static int num=100;
    public transient int num2=200;
    public Student11() {} //must have a zero parameter constructor

    public Student11(int r,String n,String d,float a)
    {
        RollNo=r; Name=n; Dept=d; Avg=a; num=900; num2=343;
    }
    
}

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception {
        //to write
       /* FileOutputStream fis=new FileOutputStream("C:/Users/sachin/MyJava/ObjectPrintStream.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fis);

        Student11 s=new Student11();
        s.RollNo=1234; s.Name="Lord Bugs Bunny"; s.Dept="Kill Craft"; s.Avg=23.43f;
        
        oos.writeObject(s);//write the whole object */

        //to read
        FileInputStream fis =new FileInputStream("C:/Users/sachin/MyJava/ObjectPrintStream.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student11 s=(Student11)ois.readObject();
        System.out.println(s.RollNo+"\n"+s.Name+"\n"+s.Dept+"\n"+s.Avg+"\n"+s.num+"\n"+s.num2);
        fis.close();
        ois.close();

        
    }
}
