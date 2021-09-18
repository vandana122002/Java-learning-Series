package Geeks_For_Geeks;

import java.util.PriorityQueue;

public class Kth_element_of_two_sorted_array {
    public static void main(String[] args)
    {
        int k=7;
        int arr1[] = {100, 112, 256, 349, 770};
        int arr2[] = {72, 86, 113, 119, 265, 445, 892};

//        int a1=0,a2=0;
//        String lu=null;
//        while(k-->0&&a1<arr1.length&&a2<arr2.length)
//        {
//            if(arr1[a1]<arr2[a2])
//            {
//                a1++;
//                lu="a1";
//            }else
//            {
//                a2++;
//                lu="a2";
//            }
//        }
//
//        while(k-->0&&a1< arr1.length)
//        {
//            a1++;
//            lu="a1";
//        }
//        while(k-->0&&a2< arr2.length)
//        {
//            a2++;
//            lu="a2";
//        }

        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:arr1)
        {
            p.add(i);
        }
        for(int i:arr2)
        {
            p.add(i);
        }

        while(k-->1)
        {
            p.remove();
        }

        System.out.println(p.peek());

    }
}
