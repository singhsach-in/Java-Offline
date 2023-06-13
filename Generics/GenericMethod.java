package Generics;
class A{}
class B extends A {}
class C extends B{}
class Data <T>
{
    T[] use = (T[]) new Object[10];
    int index=0;
    public void setxx(T value)
    {
       use[index++] = value;
    }
    public void getxx()
    {
       for(int i=0;i<index;i++)
       {
           System.out.println(use[i]);
       }
    }

}
class GenericMethod  {

    //take any data type as an array
    static <E> int show(E[] v)
    {
        for(E x: v)
        {
            System.out.println(x);
        }
        return 0;
    }

    //using Variable Argument
    static <E> int show2(E... v)
    {
        for(E x: v)
        {
            System.out.println(x);
        }
        return 0;
    }
    //Bounds works in Generics Methods
    static <E extends Number> int show3(E... v)
    {
        for(E x: v)
        {
            System.out.println(x);
        }
        return 0;
    }
     //ARGUMENTS AS GENERICS
     static <E extends Number> int show4(Data<?> obj )
     {  //<?> IS UNBOUNDED WILDCARD , MERHOD WILL FOR WITH OR WITHOUT IT
         obj.getxx(); return 0;
     }
     //UPPER BOUND WILDCRD
     static <E extends Number> int show5(Data<? extends Number> obj)
    {
       obj.getxx(); return 0;
    }
   //SUPER CAN BE USED
    static <E extends Number> int show6(Data<? super B> obj)
    {
       obj.getxx(); return 0;
    }
    public static void main(String[] args) {
       // show(new Integer[]{12,23,23,234,4});
       // show(new String[]{"hiii","bbbbbb","ur76rfgvuf","kkkkk"});

       // show2(23,43,34,54,4,45,5,5,5);
       // show2("wertwetw ","fwerfwer");

       // show3(231,43,5,45,43,454,4);
       // show3("sdfdsgsdgf","erwertwr");//Error
      
       Data<String> ds = new Data<>();
       ds.setxx("hiiiii");
       ds.setxx("byeeeeee");
       ds.setxx("huuuuuuuuuu");

       Data<Integer> ds2 = new Data<>();
       ds2.setxx(234);
       ds2.setxx(346);
       ds2.setxx(4575);

       Data<B> ds3 = new Data<>();
       Data<C> ds4 = new Data<>();
       Data<A> ds5 = new Data<>();


       show4(ds);
       show4(ds2);
      // show5(ds);//error
       show5(ds2);
       show6(ds3); // B is Super class of B
       //show6(ds4); // C is not a super class of B
       show6(ds5);
      

    }
}
