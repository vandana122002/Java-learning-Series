package Leetcode;

public class Merge_of_two_sorted_array_of_equal_size {
    public static void main(String[] args)
    {
        int[] nums1={1,3};
        int[] num2={2,4};

        int sum= nums1.length+nums1.length;
        int count=0,i=0,j=0;
        double one=0,sec=0;

        while(count<=(sum/2)&&i<nums1.length&&j<num2.length)
        {
            if(nums1[i]<num2[j])
            {
                if(count==(sum/2)-1)
                {
                    one=nums1[i];
                }
                if(count==(sum/2))
                {
                    sec=nums1[i];
                }
//                System.out.println(nums1[i]);
                i++;
                count++;
            }else if(nums1[i]>num2[j])
            {
                if(count==(sum/2)-1)
                {
                    one=num2[j];
                }
                if(count==(sum/2))
                {
                    sec=num2[j];
                }
//                System.out.println(num2[j]);
                count++;
                j++;
            }else
            {
                if(count==(sum/2)-1)
                {
                    one=nums1[i];
                }
                count++;
                if(count==(sum/2))
                {
                    sec=nums1[i];
                }
//                System.out.println(num2[j]);
                i++;
                j++;
                count++;
            }

        }
       while(count<=(sum/2)&&i< nums1.length)
       {
           if(count==(sum/2)-1)
           {
               one=nums1[i];
           }
           if(count==(sum/2))
           {
               sec=nums1[i];
           }
           i++;
           count++;
       }
       while(count<=(sum/2)&&j< num2.length)
       {
           if(count==(sum/2)-1)
           {
               one=num2[j];
           }
           if(count==(sum/2))
           {
               sec=num2[j];
           }
           j++;
           count++;
       }

        System.out.println((one+sec)/2);
    }
}
