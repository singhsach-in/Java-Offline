package MyTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createNode();

        // inOrder(root);
        // System.out.println();
        // preOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
        int height = HeinghtOfTreeFun(root);
        System.out.println("HEIGHT OF TREE IS -> " + height);
        System.out.println("Maximun Node is -> " + maximunNode(root));

        // level order traversal
        // 1 -> O(N^2) TIME COMPX
        for (int i = 1; i <= height; i++) {
            lvlOrder(root, i);
        }
        System.out.println();

        // 2 -> O(N) TIME COMPX USING QUEUE
        lvlOrderQueue(root);
        System.out.println();

        // 3 -> LVL ORDER PRINTING ACC TO LVL
        lvlOrderQueue2(root);
    }

    // CREATING TREE
    static Node createNode() {
        Node root = null;
        System.out.println("enter data");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        root = new Node(data);
        System.out.println("enter left of " + data);
        root.leftNode = createNode();
        System.out.println("enter right of " + data);
        root.rightNode = createNode();
        return root;
    }

    // TRAVERSAL
    static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.leftNode);
        System.out.print(root.data + " ");
        inOrder(root.rightNode);
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.leftNode);
        postOrder(root.rightNode);
        System.out.print(root.data + " ");
    }

    // LEVEL ORDER TRAVERSAL
    // Using loop -> time compx -> O(n^2)
    static void lvlOrder(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            lvlOrder(root.leftNode, level - 1);
            lvlOrder(root.rightNode, level - 1);
        }
    }

    // USING QUEUE -> O(N)
    static void lvlOrderQueue(Node root) {
        if (root == null)
            return;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        while (que.isEmpty() == false) {
            Node curr = que.poll();
            System.out.print(curr.data + " ");
            if (curr.leftNode != null)
                que.add(curr.leftNode);
            if (curr.rightNode != null)
                que.add(curr.rightNode);
        }
    }

    // LVL ORDER USING QUEUE AND PRINTING ACC TO LVL
    static void lvlOrderQueue2(Node root) {
        if (root == null)
            return;
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        que.add(null);// this will help in lvl Identification
        while (que.isEmpty() == false) {
            Node curr = que.poll();
            if (curr == null) {
                if (que.isEmpty())
                    return;
                que.add(null);// adding null to mark the end of lvl
                System.out.println();
                continue;
            }
            System.out.print(curr.data + " ");
            if (curr.leftNode != null)
                que.add(curr.leftNode);
            if (curr.rightNode != null)
                que.add(curr.rightNode);
        }
    }

    // HEIGHT OF TREE
    static int HeinghtOfTreeFun(Node root) {
        if (root == null)
            return 0;
        return Math.max(HeinghtOfTreeFun(root.leftNode),
                HeinghtOfTreeFun(root.rightNode))
                + 1;
    }

    // MAXIMUM WEIGHT NODE SPACE COMPX -> O(H), H-> HEIGHT OF TREE, TIME COMPX ->
    // O(N)
    static int maximunNode(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maximunNode(root.leftNode),
                maximunNode(root.rightNode)));
    }
}

class Node {
    int data;
    Node leftNode, rightNode;

    public Node(int data) {
        this.data = data;
    }
}
