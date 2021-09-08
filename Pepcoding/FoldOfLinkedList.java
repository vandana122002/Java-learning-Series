package Pepcoding;

import Java_ds_algo.Java.Linkedlist;

import java.util.ArrayDeque;
import java.util.Deque;

public class FoldOfLinkedList {
    public static void main(String[] args)
    {
        Linkedlist<Integer> l=new Linkedlist<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);

        Deque d=new ArrayDeque();
        System.out.println(d.isEmpty());

    }
}
