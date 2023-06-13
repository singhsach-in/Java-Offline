package My_LinkedList;

public class LL {
    // STRUCTURE OF NODE CLASS
    private class Node {
        int value;// VALUE IT IS GOING TO STORE
        Node next;// REFERENCE/POINTER TO THE NEXT Node

        // public Node( )
        // {
        // this.value=0;
        // }
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;// IF WE DONT MAINTAIN TAIL NODE THEN TO INSERTLAST WE HAVE TO
                      // TRAVRSE TILL NULL THEN TIME COMPLEX = O(N)
    private int size;

    public LL() // CONSTRUCTOR FOR LL
    {
        this.size = 0; // SIZE WILL BE 0 WHEN OBJ IS MADE
    }

    // GET HEAD
    public Node getHeadNode() {
        return this.head;
    }

    // INSERT THE ITEM AT 1ST POSITION
    public void insertFirst(int value)// TIME COMPLEX = O(1) CONSTANT
    {
        Node node = new Node(value);// 1ST WE CREATE THE NODE
        node.next = head;// THEN MAKE I POINT TO WHERE HEAD IS POINTING
        head = node;// THEN ASSIGN MAKE THIS NEW NODE THE HEAD OF LL
        if (tail == null)// THIS MEANS -> THIS IS 1ST ITEM SO HEAD = TAIL
        {
            tail = head;// 1ST ITEM
        }
        size++;
    }

    // INSERT THE ITEM AT LAST POSITION
    public void insertLast(int value)// TIME COMPLEX = O(1) CONSTANT
    {
        if (tail == null)// IF LL IS EMPTY
        {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);// 1ST WE CREATE THE NODE
        tail.next = node;// THEN MAKE TAIL POINTS TO IT
        tail = node;// THEN MAKE NEW NODE TAIL
        size++;
    }

    // INSERT THE ITEM AT PARTICULER POSITION
    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        } else if (index == size) {
            insertLast(value);
            return;
        }
        Node node = new Node(value);// WE CREATE NODE
        Node pre = get(index);// GET THE PREVIOUS NODE
        node.next = pre.next;// MAKE NODE TO POINT TO THE NODE WHICH PRE WAS POINTING
        pre.next = node;// MAKE PRE POINTS TO NODE
        size++;
    }

    // INSERT USING RECURSION
    public void insertByRecur(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == 1) {
            Node node = new Node(value);
            node.next = head.next;
            head.next = node;
            size++;
            return;
        }
        if (index == size) {
            insertLast(value);
            return;
        }

        Node tmp = head;
        insertByRecurSub(value, index - 1, tmp.next);
    }

    // SUB FUNCTION FOR ABOVE
    private Node insertByRecurSub(int value, int index, Node tmp) {
        if (index == 1) {
            Node node = new Node(value);
            node.next = tmp.next;
            tmp.next = node;
            size++;
            return null;
        }
        return insertByRecurSub(value, index - 1, tmp.next);
    }

    // DELETING FIRST
    public void deleteFirst()// TIME COMPLEX = O(1) CONSTANT
    {
        if (head == null) {
            System.out.println("LIST IS EMPTY, YOU MORON!!!");
            return;
        }
        head = head.next;// JUST MOVE HEAD TO THE NEXT ELEMENT
        if (head == null)// IF THERE IS ONLY 1 ITEM THEN
        { // HEAD AND TAIL BOTH ARE POINTING TO IT
            tail = null;// SO IF HEAD IS NULL THEN TAIL MUST BE NULL TOO
        }
        size--;
    }

    // DELETE LAST
    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
            return;
        }
        Node pre = get(size - 1);
        tail = pre;// MAKE PREVIOUS NODE BEFORE TAIL EQUALS TO TAIL
        pre.next = null;// AND MAKE IT POINTS TO NULL
        size--;
    }

    // DELETE FROM PARTICULAR INDEX
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        } else if (index == size) {
            deleteLast();
            return;
        }
        Node pre = get(index);// GET THE PREVIOUS NODE
        pre.next = pre.next.next;// MAKE PREVIOUS NODE POINTS TO NEXT NODE OF THE NODE
                                 // WHICH IS GOING TO DELETED
        size--;
    }

    // FINDING NODE CONTAINING A PARTICULAR VALUE
    public Node getNode(int value) {
        Node tmp = head;
        if (tmp == null) {
            System.out.println("LIST IS EMPTY, YOU MORON!!!");
            return null;
        }
        while (tmp != null)// WE CAN CHECK WHETHER A VALUE IS IN LL OR NOT
        {
            if (tmp.value == value) {
                return tmp;
            }
            tmp = tmp.next;
        }
        System.out.println("VALUE NOT FOUND");
        return null;
    }

    // GET VALUE OF A PARTICULAR NODE
    public int getValue(int index) {
        Node tmp = get(index);
        return tmp.next.value;
    }

    // GET NODE
    public Node get(int index) {
        if (index > size) {
            System.out.println("SIZE SE BAHAR JA RAHE HO , GLT INDEX");
            return null;
        }
        Node tmp = head;
        for (int i = 0; i < index - 1; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    // DISPLAY
    public void display() {
        Node tmp = head;// USING TMP BCOZ WE DONT WANNA CHANGE THE STRUCTURE OF LL
                        // CHANGING TMP WILL NOT CHANGE HEAD
        while (tmp != null) {
            System.out.print(tmp.value + " -> ");// PRINTING
            tmp = tmp.next;// MOVING TO NEXT NODE
        }
        System.out.print("END");
    }

    // DISPLAY BY PASSING HEAD NODE
    public void display(Node head) {
        Node tmp = head;// USING TMP BCOZ WE DONT WANNA CHANGE THE STRUCTURE OF LL
                        // CHANGING TMP WILL NOT CHANGE HEAD
        while (tmp != null) {
            System.out.print(tmp.value + " -> ");// PRINTING
            tmp = tmp.next;// MOVING TO NEXT NODE
        }
        System.out.print("END");
    }

    // REMOVE DUPLICATES FROM SORTED LIST
    public Node deleteDuplicates(Node head) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.next == null)
                break;
            if (tmp.value == tmp.next.value) {
                tmp.next = tmp.next.next;
                continue;
            }
            tmp = tmp.next;
        }
        return head;
    }

    // MERGE TWO LIST IN sorted list
    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null && list2 == null)
            return list1;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        Node tmp1 = list1;
        Node tmp2 = list2;
        Node node = new Node(0);
        Node tmp = node;

        while (tmp1 != null && tmp2 != null) {
            if (tmp1.value <= tmp2.value) {
                tmp.next = tmp1;
                tmp = tmp.next;
                tmp1 = tmp1.next;
            } else {
                tmp.next = tmp2;
                tmp = tmp.next;
                tmp2 = tmp2.next;
            }
        }
        while (tmp2 != null) {
            tmp.next = tmp2;
            tmp2 = tmp2.next;
            tmp = tmp.next;
        }

        while (tmp1 != null) {
            tmp.next = tmp1;
            tmp1 = tmp1.next;
            tmp = tmp.next;
        }

        return node.next;
    }

    // TO CHECK FOR CYCLE IN LL
    public boolean hasCycle(Node head) {
        // I SEE A CYCLE QUESTION
        // I USE FAST & SLOW POINTER METHOD
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            // FAST CANT BE NULL IS THERE IS A CYCLE
            // FAST CANT BE THE LAST NODE BECOZ
            // WE ARE USING FAST.NEXT.NEXT
            // SO IF FAST.NEXT IS NULL AND WE USE FAST.NEXT.NEXT
            // IT WILL GIVE NULL POINTER EXCEPTION
            fast = fast.next.next;// MOVING 2 STEPS
            slow = slow.next;// MOVING 1 STEP
            if (fast == slow)
                return true;
        }
        return false;
    }

    // GET THE NODE WHERE CYCLE BEGINS
    public Node detectCycle(Node head) {
        // I SEE CYCLE
        // I USE FAST & SLOW POINTER METHOD
        Node fast = head;
        Node slow = head;

        // THIS IS SLIGTH VARIATIO FROM TRADITIONAL METHOD
        // SO 1ST WE FIND THE LENGTH OF THE CYCLE
        // IF NO CYCLE FOUND RETURN NULL
        int len = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                len = findCycleLen(fast, slow);
                break;
            }
        }
        // IF LENGTH OF CYCLE IS 0 THEN THERE IS NO CYCLE
        if (len == 0)
            return null;

        // WE USE 2 MORE POINTERS, 1ST->F & 2ND->S
        Node f = head;
        Node s = head;
        // WE MOVE S, LEN TIMES IN THE LIST
        while (len > 0) {
            s = s.next;
            len--;
        }

        // NOW WE MOVE F AND S, 1 STEP AT A TIME AND THEY WILL
        // MEET EVENTUALLY AND RETURN ANY OF THEM
        while (f != s) {
            s = s.next;
            f = f.next;
        }
        return s;

    }

    // FIND LENGTH OF THE CYCLE
    public int findCycleLen(Node f, Node s) {
        int count = 0;
        // USING DO-WHILE BCOZ F AND S ARE ALREADY EQUAL
        // WE NEED LOOP TO RUN ATLEAST ONCE
        do {
            count++;
            s = s.next;
        } while (s != f);

        return count;
    }

    // GET MIDDLE NODE
    public Node middleNode(Node head) {
        // WE CAN USE FAST AND SLOW POINTER METHOD HERE AS WELL
        Node fast = head;
        Node slow = head;
        // IDEA IS FAST POINTER WILL BE AT 2X SPEED THAN SLOW POINTER
        // SO WHEN THE FAST POINTER WILL REACH THE LAST -> NULL
        // THE SLOW WILL BE AT MIDDLE
        while (fast != null && fast.next != null) {
            fast = fast.next.next;// 2 STEPS
            slow = slow.next;// 1 STEP
        }
        return slow;
    }

    // REVERSE THE LINKED LIST BY RECURSION
    public Node reverseBYRecur(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newHead = reverseBYRecur(head.next);
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    // REVERSE BY ITERATION -> IN PLACE REVERSAL OF LIST
    public Node reverse(Node head) {
        Node curr = head;
        Node pre = null;
        while (curr != null) {
            Node tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }
        return pre;
    }

    // REVERSING FROM A PARTICULAR INDEX TO INDEX
    public Node reverseBetween(Node head, int left, int right) {
        if (left == right)
            return head;
        Node curr = head;
        Node pre = null;
        // WE MOVE TILL LEFT-1
        // SO WHEN THE LOOP ENDS WE'LL HAVE NODE BEFORE LEFT ON PREVIOUS
        // AND LEFT NODE ON CURRENT
        for (int i = 0; i < left - 1 && curr != null; i++) {
            pre = curr;
            curr = curr.next;
        }

        // CURRENT WILL HE THE NEW HEAD OF THE LIST TO BE REVERSED
        Node newHead = curr;
        Node last = pre;

        // REVERSING ALL THE ELEMENTS B/W LEFT AND RIGHT INCLUDING THEM
        for (int i = 0; i < right - left + 1 && curr != null; i++) {
            Node tmp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = tmp;
        }

        // NOW IF LAST IS NULL THEN PREVIOUS IS EQUALS TO HEAD
        if (last == null) {
            head = pre;
        } else {
            last.next = pre;
        }
        newHead.next = curr;
        return head;
    }

    // CHECK FOR PALINDROME
    public boolean isPalindrome(Node head) {
        Node mid = middleNode(head);
        Node newHead = reverse(mid);
        Node curr = head;

        while (curr != null && newHead != null) {
            if (curr.value != newHead.value) {
                break;
            }
            curr = curr.next;
            newHead = newHead.next;
        }
        return curr == null || newHead == null;
    }
}