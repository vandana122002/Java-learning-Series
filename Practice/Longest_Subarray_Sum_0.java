package Practice;

import java.util.HashMap;

public class Longest_Subarray_Sum_0 {
    public static void main(String[] args)
    {
        int[] arr={2,8,-3,-5,2,-4,6,1,2,1,-3,4};
        HashMap<Long,Integer> h=new HashMap<>();
        Long sum=0l;
        sum+=arr[0];
        h.put(sum,0);
        int c=0,pc=0;
        for(int i=1;i<arr.length;i++)
        {
            sum+=arr[i];
            if(h.containsKey(sum))
            {
                System.out.println("sum "+sum);
                c++;
            }else
            {
                h.put(sum,i);
            }
        }

        System.out.println(h);
        System.out.println(c);
    }
}
