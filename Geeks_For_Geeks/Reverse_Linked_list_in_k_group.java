package Geeks_For_Geeks;

class Node1
{
    int data;
    Node1 next;
    Node1(int val)
    {
        data=val;
        next=null;
    }
}
public class Reverse_Linked_list_in_k_group {

    public static Node1 checker(Node1 head)
    {
        Node1 prev=null;
        Node1 f=head;
        Node1  n=head.next;
        Node1 o=head;
        Node1 ans=null;
        int count=0;
        int k=8;
        while(f!=null&&n.next!=null)
        {
            for(int i=0;i<k;i++)
            {
                f.next=prev;
                prev=f;
                f=n;
                if(n!=null)
                    n=n.next;
            }
            if(count==0)
            {
                ans=prev;
                count++;
            }
        System.out.println("prev "+prev.data);
            if(f!=null)
              System.out.println(f.data);
//        System.out.println(n.data);
        o.next=f;
//        o=prev;
//        prev=null;
        }
        return prev;
    }
    public static void main(String[] args)
    {
        Node1 node=new Node1(1);
        Node1 node1=new Node1(2);
        Node1 node2=new Node1(2);
        Node1 node3=new Node1(4);
        Node1 node4=new Node1(5);
        Node1 node5=new Node1(6);
        Node1 node6=new Node1(7);
        Node1 node7=new Node1(8);

        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        Node1 ans=checker(node);
        while(ans!=null)
        {
            System.out.println(ans.data);
            ans=ans.next;
        }


    }
}
