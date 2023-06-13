package Generics;

class MyArray<T extends Number>//It will take any object which will be a extending from Number Like - Float,Integer,Double.
{
    T[] A=(T[]) new Object[10]; // many objects but a defined type.
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
  
class GenericsDemo6
{
    public static void main(String[] args) {
        
        MyArray<Integer> ma = new MyArray<>();
        ma.append(76467);
        ma.append(23454);
        ma.display();
    }
}