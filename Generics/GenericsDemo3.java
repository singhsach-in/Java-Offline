package Generics;
class Generics<T> //one object only
{
    T obj;
    public void setxx(T value)
    {
        obj=value;
    }
    public T getxx()
    {
        return obj;
    }
}
class MyArray<T,K>
{
    T[] A=(T[]) new Object[10];
    int length=0;
    public void append(T value)
    {
        A[length++]=value;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(A[i]);
        }
    }
}

public class GenericsDemo3 {
    
    public static void main(String[] args) {
        Generics<Integer> gn=new Generics<>();
        gn.setxx(214);
        System.out.println(gn.getxx());
        gn.setxx(10);

        MyArray<String,Integer> ma=new MyArray<>();
        ma.append("gtyiiyrt");
        ma.append("gitgiu");
        ma.append("jiygiuguj");
       // ma.append(34);
        ma.display();
    }
}
