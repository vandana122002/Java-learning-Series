package AJava;


import java.util.ArrayList;
import java.util.Iterator;

public class LearningIterator {
    public static void main(String[] args)
    {
        ArrayList l1=new ArrayList();
        l1.add(1);l1.add(2);l1.add(3);l1.add(4);l1.add(5);l1.add(6);
        Iterator i1=l1.iterator();
        while(i1.hasNext())
        {
            System.out.println(i1.next());
        }


    }
}
