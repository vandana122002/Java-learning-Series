package Practice;

import Java_ds_algo.Java.Linkedlist;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CountOfChar {
    public static void main(String[] args)
    {
        HashMap<int[],String> h=new HashMap<>();

        int[] arr={1,2,3};
        int[] arr1={2,3};
        int[] arr2={1,3};
        h.put(arr,"app");
        h.put(arr1,"ban");
        h.put(arr2,"straw");

        for(int[] i:h.keySet())
        {
            for(int j:i)
            {
                System.out.println(j);
            }
        }
//        System.out.println(h.keySet());
    }
}
