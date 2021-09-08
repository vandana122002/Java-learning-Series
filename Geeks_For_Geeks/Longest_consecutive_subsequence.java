package Geeks_For_Geeks;

import java.util.PriorityQueue;

public class Longest_consecutive_subsequence {
    public static void main(String[] args)
    {
//        int a[] = {6,6,2,3,1,4,1,5,6,2,8,7,4,2,1,3,4,5,9,6};

        int a[]={8,8,9,9,3,4};
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:a)
        {
            p.add(i);
        }
        int count=1,pre_count=0;
        int val=p.poll();
        System.out.println("val is "+val);
        while(!p.isEmpty())
        {
            if(val+1==p.peek())
            {
                System.out.println("val1 is "+val);
                val=p.poll();
                count++;
                System.out.println("count is  "+count);
            }else if(val==p.peek())
            {
                System.out.println("val2 is "+val);
                val=p.poll();
            }else
            {
                System.out.println("val3 is "+val);
                if(count>pre_count)
                {
                    pre_count=count;
                }
                val=p.poll();
                count=1;
            }
        }
        if(count>pre_count)
        {
            pre_count=count;
        }
        System.out.println(pre_count);
    }
}
