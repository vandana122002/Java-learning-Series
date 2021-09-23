package Geeks_For_Geeks;

import java.util.HashSet;

public class Subarray_with_sum_0 {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        boolean check=false;
        HashSet<Long> a=new HashSet<>();
        long sum=arr[0];
        a.add(sum);
        for(int i=1;i<arr.length;i++)
        {
            sum+=arr[i];
            if(a.contains(sum))
            {
                check=true;
                System.out.println(true);
            }
            System.out.println(sum);
        }

        if(!check)
        {
            System.out.println(false);
        }
    }
}
