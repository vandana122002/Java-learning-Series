package Geeks_For_Geeks;

import java.util.ArrayList;
class Node {

    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BT {

    static Node root;

    /* The functions prints all the keys which in
     the given range [k1..k2]. The function assumes than k1 < k2 */
    void Print(ArrayList<Integer> a, Node node, int low, int high) {

        /* base case */
        if (node == null) {
            return;
        }
        if (node.data > low) {
            Print(a, node.left, low, high);
        }
        if(node.data < high)
        {
            Print(a, node.right, low, high);
        }
        if(node.data>=low&&node.data<=high)
            a.add(node.data);
    }
    public static void main(String[] args) {
        BT tree = new BT();
        int k1 = 13, k2 = 23;
        tree.root = new Node(9);
        tree.root.left = new Node(4);
        tree.root.right = new Node(18);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.right.left = new Node(17);
        tree.root.right.right = new Node(19);
        tree.root.left.left.right=new Node(3);
        tree.root.left.right.left = new Node(5);
        tree.root.left.right.right = new Node(7);


        ArrayList<Integer> a=new ArrayList<>();
        tree.Print(a,root, k1, k2);

        for(int i:a)
        {
            System.out.println(i);
        }
    }
}

