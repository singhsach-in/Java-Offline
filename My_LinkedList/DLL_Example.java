package My_LinkedList;

public class DLL_Example {
    public static void main(String[] args) {
        //CREATE 
        DLL list = new DLL();

        //INSERT AT FIRST POSITION
        list.insertFirst(9);
        list.insertFirst(8);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertFirst(5);
        list.insertFirst(4);

        //INSERT AT LAST POSITION
        list.insertLast(10);
        list.insertLast(11);
        list.insertLast(12);
        list.insertLast(13);

        // //INSERT AT PARTICULAR POSITION
        // list.insert(17, 4);

        //DISPLAY ALL
        list.display();

        //DISPLAY REVERSE
        // list.displayReverse();

        //INSERT AT PARTICULAR POSITION
        // list.insert(17, 4);
        // list.display();

        //INSERT AFTER A PARTICLAR VALUE
        list.insertAfter(8, 18);
        list.display();

    }
}
