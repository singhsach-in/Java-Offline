package Generics;
public class GenericsDemo1 {
    public static void main(String[] args) {
        
        Object ob=new String("hhhhhhh");
        System.out.println(ob);
        String str=(String)ob;
        System.out.println(ob);
        ob=new Integer(142);
        System.out.println(ob);
       // String str2=(String)ob;
       // System.out.println(ob);
       Object[] ob2=new Object[3];//can store any data type
       ob2[0]="hhhhiiiiiiii";//string
       ob2[1]="byeeeeeeeeeeeeeeee";//string
       ob2[2]=10;//Integer
       //printing
       String str2;
       for(int i=0;i<3;i++)
       {
            str2=(String)ob2[i];
            System.out.println(str2);//showing no error at compile time
            //but throw error at run time

       }
       //solution of above problem - Generics
       


    }
}
