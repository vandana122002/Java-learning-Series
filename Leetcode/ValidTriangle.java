package Leetcode;

import java.util.Arrays;

public class ValidTriangle {

    public static void main(String[] args)
    {
        int[] nums={5,6,7,1,2,3,6,9};
        Arrays.sort(nums);
        int len=nums.length-1;
        int count=0;
        for(int i=0;i<nums.length-2;i++)
        {
            count+=checker(nums,nums[i],i+1,nums.length-1,len);
            len--;
        }
        System.out.println(count);
    }

    private static int checker(int[] nums, int val, int start, int end, int len) {
        int b=nums[start];
        int ans=0;
        for(int c=start+1;c<=end;c++)
        {
            if(val+b>nums[c])
            {
                ans=len-1;
                break;
            }else
            {
                break;
            }
        }
        return ans;
    }
}
