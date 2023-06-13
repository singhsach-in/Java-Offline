package My_LinkedList;

public class CircularLL_Example {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();

        //INSERT AT LAST
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);

        //DISPLAY
        list.display();

        //DELETE BY VALUE
        list.deleteByValue(4);
        list.display();
    }
}
