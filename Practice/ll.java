package Practice;


class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class ll {

    static Node arrange(Node head)
    {
       Node checker=head;
       int size=0;
       while(checker!=null)
       {
           checker=checker.next;
           size++;
       }
       Node back=head,back_n;


         for(int i=0;i<(size/2)-1;i++)
         {
             back=back.next;
         }



         back_n=back.next;


        Node prev=null;
        Node n=head;
        Node nn=head.next;
        while(n!=back_n)
        {
            n.next=prev;
            prev=n;
            n=nn;
            nn=nn.next;
        }


        Node starter;
        if(size%2!=0) {
            starter = new Node(back_n.data);
            back_n = back_n.next;
            Node s_n = starter;
            while (back != null && back_n != null) {
                Node nexter = new Node(back.data);
                s_n.next = nexter;
                s_n = s_n.next;
                nexter = new Node(back_n.data);
                s_n.next = nexter;
                s_n = s_n.next;
                back_n = back_n.next;
                back = back.next;
            }

            while (back != null) {
                Node nexter = new Node(back.data);
                s_n.next = nexter;
                s_n = s_n.next;
                back = back.next;
            }
        }else
        {
            starter = new Node(back.data);
            back = back.next;
            Node s_n = starter;
            while (back != null && back_n != null) {
                Node nexter = new Node(back_n.data);
                s_n.next = nexter;
                s_n = s_n.next;
                nexter = new Node(back.data);
                s_n.next = nexter;
                s_n = s_n.next;
                back_n = back_n.next;
                back = back.next;
            }

            while (back_n != null) {
                Node nexter = new Node(back_n.data);
                s_n.next = nexter;
                s_n = s_n.next;
                back_n = back_n.next;
            }
        }
        return starter;
    }

    public static void main(String[] args)
    {
        Node n=new Node(1);
        Node n1=new Node(2);
        Node n2=new Node(3);
        Node n3=new Node(4);
        Node n4=new Node(5);
        Node n5=new Node(6);
//        Node n6=new Node(7);
//        Node n7=new Node(8);
        n.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
//        n5.next=n6;
//        n6.next=n7;
        Node h=arrange(n);

        while(h!=null)
        {
            System.out.print(h.data+" ");
            h=h.next;
        }
    }
}
