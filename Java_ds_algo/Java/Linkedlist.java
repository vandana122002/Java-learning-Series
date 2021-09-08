package Java_ds_algo.Java;

import java.util.Collections;
import java.util.Comparator;

public class Linkedlist<E> {
    Node<E> head;
    static class Node<E>
    {
        E data;
        Node<E> next;
        Node(E data)
        {
            this.data=data;
            next=null;
        }
    }
    public void add(E num)
    {
        Node<E> next=new Node(num);
        if(head==null)
        {
            head=next;
        }else
        {
            Node<E> temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=next;
        }
    }
    boolean isEmpty()
    {
        if(head==null)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public E toremove(int index) throws Exception
    {
        Node temp=head;
        E toRemove;
        //        Node previousTemp=null;
        if(temp==null)
        {
            throw new Exception("List is Empty");
        }
        if(index==0)
        {
            toRemove=head.data;
            head=head.next;
            return toRemove;
        }else{
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            toRemove= (E) temp.next.data;
            temp.next=temp.next.next;
            return toRemove;
        }
    }


    public void print()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Null");
        }else{
        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
        }
    }

    public void clear()
    {
        head=null;
    }

    public void addAll(Linkedlist l)
    {
        Node temp=head;
//        System.out.println("l1 data"+l.head.data);
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=l.head;
    }

    public void set(int index,int value)
    {
        Node temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        temp.data=value;
    }
    public E get(int index)
    {
        Node<E> temp=head;
        for(int i=1;i<index;i++)
        {
            temp=temp.next;
        }
        return temp.data;
    }


        public static void main(String[] args) throws Exception {
            Linkedlist<Integer> l1=new Linkedlist<>();
            Linkedlist<String> l2=new Linkedlist<>();
            l1.add(2);
            l1.add(3);
            l1.add(4);
            l1.add(5);
            System.out.println(l1.toremove(1));
            System.out.println();
            l2.add("6");
            l2.add("7");
            l1.addAll(l2);
            l1.set(2,10);
            l1.print();
            System.out.println(l1.get(3));
        }
}
