package Practice;


import java.util.LinkedList;
import java.util.NoSuchElementException;

class Linkedlist<E> {
    static class Node<E>
    {
        E data;
        Node<E> next;
        Node(E data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node<E> head=null;
    Node<E> tail=null;
    private int size=0;
    public int size()
    {
        return size;
    }
    boolean isEmpty()
    {
        return head==null;
    }
    public void add(E data)
    {
        Node<E> n=new Node(data);
        if(isEmpty())
        {
            head=n;
            size++;
            tail=n;
        }else
        {
            tail.next=n;
            tail=n;
            size++;
        }
    }

    public E get(int index)
    {
        if(isEmpty()||size<=index)
            throw new NoSuchElementException();
        Node<E> current=head;
        for(int i=0;i<index;i++)
        {
            current=current.next;
        }
        return current.data;
    }

    public E remove(int index)
    {
        E temp;
        if(size<index)
        {
            throw new NoSuchElementException();
        }
        Node<E> current=head;
        if(index==0)
        {
            head=head.next;
            temp=current.data;
            current.next=null;
            size--;
        }else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            if(current.next==tail)
            {
                tail=current;
                temp = current.next.data;
                current.next.next = null;
                tail.next = null;
            }else {
                temp = current.next.data;
                Node<E> release=current.next;
                current.next = current.next.next;
                release.next=null;
            }
            size--;
        }
        return temp;
    }

    public Node<E> getNodeAt(int idx)
    {
        Node<E> temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void reverseDI() {
        // write your code here
        int i=0,r=size-1;
        E temp;
        if(i==r||r<0)
        {
            return ;
        }else
        {
            while(i<r)
            {
                Node<E> leftValue=getNodeAt(i);
                Node<E> rightValue=getNodeAt(r);
                temp=leftValue.data;
                leftValue.data=rightValue.data;
                rightValue.data=temp;
                i++;
                r--;
            }
        }
    }
    public void reversePI(){
        // write your code here
        if(size==0||size==1)
        {
            return;
        }
        Node<E> pc=head;
        Node<E> c=head.next;
        tail=pc;
        Node<E> temp;
        pc.next=null;
        while(c.next!=null)
        {
            temp=c.next;
            c.next=pc;
            pc=c;
            c=temp;
        }
        c.next=pc;
        head=c;
    }

    public E mid(){
        // write your code here
        if(head.next==null||head.next.next==null)
        {
            return head.data;
        }else
        {
            Node<E> s=head;
            Node<E> f=head;
            while(f.next!=tail&&f.next!=null)
            {
                f=f.next.next;
                s=s.next;
            }
            return s.data;
        }

    }

    public  Linkedlist<Integer> mergeTwoSortedLists(Linkedlist<Integer> l1, Linkedlist<Integer> l2) {
        // write your code hered
        Linkedlist<Integer> list=new Linkedlist<Integer>();
        Node<Integer> first=l1.head;
        Node<Integer> second=l2.head;
        while(first!=null&&second!=null)
        {
            if(first.data<=second.data)
            {
                list.add(first.data);
                first=first.next;
            }else
            {
                list.add(second.data);
                second=second.next;
            }
        }
        while(first!=null)
        {
            System.out.println("first "+first.data);
            list.add(first.data);
            first=first.next;
        }
        while(second!=null)
        {
            list.add(second.data);
            second=second.next;
        }

        return list;
    }

    public void removeDuplicates(){
        // write your code here
        Node current=head;
        Node temp=head;
        while(current.next!=null){
            System.out.println("data "+current.data+" "+current.next.data);
            if(current.data==current.next.data)
            {
                temp=current.next;
                current.next=current.next.next;
                temp.next=null;
                size--;
            }else
            {
                current=current.next;
            }
        }
    }

    public void fold() {
        // write your code here
        int c=0,pc=1,j=size-1;
        while(pc<j)
        {
            Node current=getNodeAt(c);
            Node pcurrent=getNodeAt(pc);
            Node last=getNodeAt(j);
            current.next=last;
            last.next=pcurrent;
            c+=2;
            pc+=2;
        }
        if(pc>=j)
        {
            if(pc==size){
                pc=pc-1;
            }
            Node pcurrent=getNodeAt(pc);
            pcurrent.next=null;
            tail=pcurrent;
        }
    }

    private void reversePRHelper(Node node){
        // write your code here
        if(node.next==tail)
        {
            node.next.next=node;
            head=node.next;
            return ;
        }
        reversePRHelper(node.next);
        node.next.next=node;
    }

    public void reversePR(){
        // write your code here
        Node temp=head;
        reversePRHelper(head);
        temp.next=null;
        tail=temp;

    }

    public void kReverse(int k) {
        // write your code here
        for(int i=0;i+k<size;i+=k)
        {
            int j=i;
            int l=i+k-1;
            while(j<l)
            {
                Node<E> first=getNodeAt(j);
                Node<E> sec=getNodeAt(l);
                E temp=first.data;
                first.data=sec.data;
                sec.data=temp;
                j++;
                l--;
            }
        }
    }

}


public class linkedlist
{
    public static void main(String[] args)
    {
        Linkedlist<Integer> ll = new Linkedlist<Integer>();
        ll.add(5);
        ll.add(6);
        ll.add(7);
        ll.add(8);
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
        System.out.println(ll.remove(1));

        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
        System.out.println("reverse pi");
        ll.kReverse(3);
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));
        }
        System.out.println(ll.mid());
        Linkedlist<Integer> l1=new Linkedlist<Integer>();
        Linkedlist<Integer> l2=new Linkedlist<Integer>();
        l1.add(10);
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);

        Linkedlist<Integer> ans=ll.mergeTwoSortedLists(l1,l2);
        System.out.println("Ans is "+ans.size());
        for(int i=0;i< ans.size();i++)
        {
            System.out.println(ans.get(i));
        }
        System.out.println("reverse");
        l2.reversePR();
        for(int i=0;i< l2.size();i++)
        {
            System.out.println(l2.get(i));
        }
        System.out.println("Duplicates");
        Linkedlist<Integer> l3=new Linkedlist<Integer>();
        l3.add(2);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(5);
        l3.removeDuplicates();
        for(int i=0;i<l3.size();i++)
        {
            System.out.println(l3.get(i));
        }
    }
}
