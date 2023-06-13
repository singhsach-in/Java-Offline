package Generics;
public class GenericsDemo2<T>
{
    T data[]=(T[]) new Object[3];
    public static void main(String[] args) {
        
        GenericsDemo2<String> gd=new GenericsDemo2<String>();
        gd.data[0]="hiiiiiiiiiii";
        gd.data[1]="byeeeeeee";
         // gd.data[2]=10; // error , checks at compile time
         // gd.data[2]=new Integer(10); //error
         //now only string can be stored
        gd.data[2]="tataaaaaaaaaaa";
       
        String str= gd.data[0];//No need to typecast
        System.out.println(str);
        for(int i=0;i<3;i++)
        {
            str=gd.data[i];
             System.out.println(str);
        } 

    }
}
