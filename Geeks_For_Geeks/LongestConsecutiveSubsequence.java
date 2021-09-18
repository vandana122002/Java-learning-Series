package Geeks_For_Geeks;

import java.util.PriorityQueue;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args)
    {
        int[] a={1,9,3,10,4,20,2};
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:a)
        {
            p.add(i);
        }

        int val=p.poll();
        int pc=0,c=0;
        for(int i=1;i<a.length;i++)
        {
            if(val+1==p.peek())
            {
                val=p.poll();
                c++;
            }else if(val==p.peek())
            {
                val=p.poll();
            }else
            {
                if(c>pc)
                {
                    pc=c;
                    val=p.poll();
                }
            }
        }

        if(c>pc)
        {
            c=pc;
        }
        System.out.println(c);

    }
}
