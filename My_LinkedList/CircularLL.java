package My_LinkedList;

public class CircularLL {
    
    private class Node
    {
        int value;
        Node next;

        public Node(int value)
        {
            this.value=value;
        }
        public Node(int value, Node next)
        {
            this.value=value;
            this.next=next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLL()
    {
        this.size=0;
    }

    //INSERT AT LAST
    public void insert(int value)
    {
        Node node=new Node(value);
        if(head == null)
        {
            head=node;
            tail=node;
            size++;
            return;
        }
        tail.next =node;
        node.next = head;
        tail=node;
        size++;
    }

    //DELETE A PARTICULAR NODE
    public void deleteByValue(int value)
    {
        if(head.value == value)
            {
                head=head.next;
                tail.next=head;
                return;
            }
        Node pre = getPreNodeByValue(value);
        if(pre == null)
        {
            System.out.println("VALUE NOT FOUND");
            return;
        }
        pre.next =pre.next.next;
        size--;
    }

    //GET PREVIOUS NODE


    //GET NOT BY VALUE
    public Node getPreNodeByValue(int value)
    {
        Node tmp=head;
        if(tmp == null)
        {
            System.out.println("LIST IS EMPTY");
            return null;
        }
        if(tmp != null)
        {
            
            do
            {
                if(tmp.next.value == value)
                {
                    return tmp;
                }
                tmp=tmp.next;
            }while(tmp != head);
            System.out.println("VALUE NOT FOUND");
        }
        return null;
    }

    //DISPLAY ALL
    public void display()
    {
        Node tmp=head;
        if(tmp == null)
        {
            System.out.println("LIST IS EMPTY");
            return;
        }
        if(tmp != null)
        {
            do
            {
                System.out.print(tmp.value+" -> ");
                tmp=tmp.next;
            }while(tmp != head);
            System.out.print("HEAD");
            System.out.println();
        }
    }
    
}
