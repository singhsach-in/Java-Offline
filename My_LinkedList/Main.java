package My_LinkedList;

public class Main {
    public static void main(String[] args) {
    
        //CREATING THE LL
        // LL list = new LL();

        //INSERTING AT 1ST PLACE
        // list.insertFirst(9);
        // list.insertFirst(9);
        // list.insertFirst(9);
        // list.insertFirst(8);
        // list.insertFirst(7);
        // list.insertFirst(7);
        // list.insertFirst(6);
        // list.insertFirst(5);
        // list.insertFirst(4);
    
        //DISPLAY ALL
        // list.display();

        //INSERTING AT LAST PLACE
        // list.insertLast(10);
        // list.insertLast(11);
        // list.insertLast(12);
        // list.insertLast(13);

        //DISPLAY
        // list.display();

        //INSERTING AT PARTICULAR PLACES
        // list.insert(10, 3);
        // list.display();

        // System.out.println();

        //DELETE FROM 1ST
        // list.deleteFirst();
        // list.display();
        // System.out.println();
        // list.deleteFirst();
        // list.display();

        //DELETE FROM LAST
        // list.deleteLast();
        // list.display();
        // System.out.println();    
        // list.deleteLast();
        // list.display();

        //DELETE AT PARTICULER INDEX
        // list.delete(3);
        // list.display();

        //GET NODE CONTAINING PARTICULER VALUE
        // System.out.println(list.getNode(6).value);
        //   list.getNode(6).value;
        // if(list.getNode(6) != null)
        // {
        //     System.out.println("exists");
        // }
        // else
        // System.out.println("does not exists");

        //GET VALUE OF A PARTICULAR NODE
        //   int value =  list.getValue(3);
        //   System.out.println(value);

        //INSERT Y RECURSION
        // list.insertByRecur(11, 3);
        // list.display();

        //REMOVE DUPLCATES FRO SORTED LIST
        // list.deleteDuplicates(list.getHeadNode());
        // list.display();

        // LL list2 = new LL();
        // list2.insertLast(9);
        // list2.insertLast(11);
        // list2.insertLast(12);
        // list2.insertLast(13);
        // list2.insertLast(91);
        // list2.display();
        // System.out.println();

        // LL list3 = new LL();
        // list3.insertLast(9);
        // list3.insertLast(15);
        // list3.insertLast(22);
        // list3.insertLast(34);
        // list3.insertLast(491);
        // list3.display();
        // System.out.println();

        //MERGE TWO LISTS sorted list
        // LL list4 = new LL();
        // list4.display(list.mergeTwoLists(list2.getHeadNode(), list3.getHeadNode()));

        //  list3.reverseBYRecur(list3.getHeadNode());
        //  list3.display(list3.getHeadNode());
        // list3.display(list.reverseBYRecur(list.getHeadNode()));

        LL l = new LL();
        l.insertFirst(9);
        l.insertFirst(8);
        l.insertFirst(7);
        l.insertFirst(6);
        l.insertFirst(5);
        // l.display();
        // l.reverseBYRecur(l.getHeadNode());
        // l.reverse(l.getHeadNode());
        // l.display(l.getHeadNode());

        // System.out.println(l.isPalindrome(l.getHeadNode()));
        // l.display();
        // l.reverse(l.getHeadNode());
        // l.display();
        System.out.println(l.isPalindrome(l.getHeadNode()));
    }
}
