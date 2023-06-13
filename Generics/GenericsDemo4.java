package Generics;

 class GenericsDemo4 {
    public static void main(String[] args) {
        Object obj = new String("HIIIIII");
        System.out.println(obj);
      
        //obj = new Integer(10);//no error at compile time.
        // give Error ClassCast at run time.Can't typecast Integer as String.
        // String str = obj; // Error : cannot convert from Object to String.
       // String str = (String) obj; //have to typecast it
     
        System.out.println(obj);
       // String str2;
        Object[] ob = new Object[3];
        ob[0] = "Hiiiii";
        ob[1] = "Byeee"; // assign as object.
        ob[2] = 10; //no Error at compile time.
        for(Object x : ob)
        {
            System.out.println((String)x); 
        }   
            
        
    }    
}
