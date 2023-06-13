package My_LinkedList;

import java.security.PublicKey;

public class DLL {
    
    private class Node
    {
        int value;
        Node next;
        Node pre;

        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value, Node next, Node pre)
        {
            this.value=value;
            this.next=next;
            this.pre=pre;
        }
    }

   private Node head;
   private Node tail;
   private int size;
   public DLL()
   {
       this.size=0;
   }

   //INSERTING AT FIRST POSITION
   public void insertFirst(int value)
   {
       Node node = new Node(value);//CREATE THE NODE
       node.next = head;//MAKE IT POINTS TO HEAD
       node.pre = null;//MAKE ITS PREVIOUS POINTS TO NULL
       if(head != null)//IF WE DO THIS AND HEAD IS NULL THEN IT WILL THROW NUL POINTER EXCEPTION
       {
        head.pre = node;//IF HEAD IS NULL THEN WE'LL WE DOING NULL.PRE -> ERROR
       }
       head = node;
       size++;
   }

   //INSERT AT LAST POSITION
   public void insertLast(int value)
   {
       Node node = new Node(value);
       Node last = getLastNode();
       if(last == null)
       {
            // System.out.println("LIST IS EMPTY,YOU MORON!!!");
            node.pre = null;
            head=node;//THEN WE MAKE NODE HEAD CAUSE IT IS A 1ST ITEM IN DLL
            return;
       }
       last.next = node;
       node.pre = last;
       node.next = null;
       size++;
   }

   //INSERT AT PARTICULAR POSITION
   public void insert(int value , int index)
   {
       if(index > size)
       {
           System.out.println("BAHAR JA RAHE HO LIST K");
           return;
       }
       if(index == 0)
       {
           insertFirst(value);
           return;
       }
       if(index == size)
       {
           insertLast(value);
           return;
       }
       Node node= new Node(value);
       Node pre = getPreNode(index);
        //    if(pre == null)
        //    {
        //        System.out.println("LIST IS EMPTY,YOU MORON!!!");
        //        return;
        //    }
       node.next = pre.next;
       node.pre = pre;
       pre.next = node;
       node.next.pre = node;
       size++;
   }

   //INSERT AFTER A PARTICULAR VALUE
   public void insertAfter(int after , int value )
   {
       Node pre = getNode(after);
       if(pre == null)
       {
           System.out.println("NODE WITH VALUE "+value+" NOT EXITS");
           return;
       }
       Node node= new Node(value);
       node.next = pre.next;
       node.pre = pre;
       pre.next = node;
       if(node.next != null)
       node.next.pre = node;
       size++;
   }

   //DISPLAY ALL
   public void display()
   {
       Node tmp = head;
       if(tmp == null)
       {
           System.out.println("LIST IS EMPTY,YOU MORON!!!");
           return;
       }
       while(tmp != null)
       {
           System.out.print(tmp.value+" -> ");
           tmp = tmp.next;
       }
       System.out.print("END");
       System.out.println();
   }

   //GET PREVIOUS NODE
   public Node getPreNode(int index)
   {
       Node tmp = head;
       if(tmp == null)
       {
           System.out.println("LIST IS EMPTY,YOU MORON!!!");
           return null;
       }
       for(int i=0;i<index-1;i++)
       {
           tmp=tmp.next;
       }
       return tmp;
   }

   //GET LAST NODE
   public Node getLastNode()
   {
        Node tmp = head;
        Node last = null;//WITHOUT TAIL
        if(tmp == null)
        {
            System.out.println("LIST IS EMPTY,YOU MORON!!!");
            return null;
        }
        while(tmp != null)
        {
            last = tmp;//TRAVERSE TO THE LAST NODE
            tmp = tmp.next;
        }
        return last;
   }
   //GET NODE BY VALUE
   public Node getNode(int value)
    {
        Node tmp = head;
        if(tmp == null)
        {
            System.out.println("LIST IS EMPTY, YOU MORON!!!");
            return null;
        }
        while(tmp != null)//WE CAN CHECK WHETHER A VALUE IS IN LL OR NOT
        {
            if(tmp.value == value)
            {
                return tmp;
            }
            tmp = tmp.next;
        }
        System.out.println("VALUE NOT FOUND");
        return null;
    }

   //DISPLAY ALL REVERSE
   public void displayReverse()
   {
       
       Node last = getLastNode();//WITHOUT TAIL
       
       while(last != null)//THEN TRAVERSE BACKWARD -> O(N)
       {
         System.out.print(last.value+" -> ");
         last = last.pre;
       }
       System.out.print("START");
       System.out.println();
   }

}
