package Geeks_For_Geeks;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class SubarraysWithSumK {
    static int countSubarrays(int[] arr,int k)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("sum-k "+h.getOrDefault(sum-k,0)+" "+(sum-k)+" "+sum);
            if(h.getOrDefault(sum-k,0)!=0)
            {
                count+=h.get(sum-k);
                System.out.println("sum1 is "+sum);
                h.put(sum,h.getOrDefault(sum,0)+1);
            }else
            {
                System.out.println("sum is "+sum);
                h.put(sum,h.getOrDefault(sum,0)+1);
            }
            sum+=arr[i];
        }
        System.out.println("sum-k "+h.getOrDefault(sum-k,0)+" "+(sum-k)+sum);
        if(h.getOrDefault(sum-k,0)!=0)
        {
            System.out.println("count is "+count);
            count+=h.get(sum-k);
            System.out.println("sum1 is "+sum);
            h.put(sum,h.getOrDefault(sum,0)+1);
        }else
        {
            System.out.println("sum is "+sum);
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        for(int i:h.keySet())
        {
            System.out.println(i+" "+h.get(i));
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[] arr={1,-7,4,-3,-3};
        int k=-3;
        System.out.println(countSubarrays(arr,k));
    }
}
