package Practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class iteratorLearn {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        Integer[] arr={1,2,3,4};
        LinkedList<Integer> l1=new LinkedList<>(Arrays.asList(arr));
        Iterator<Integer>  i=l1.iterator();

        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
