package Leetcode;

public class Find_one_dupliacte_no {

    public static int duplicacy(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            nums[nums[i]%nums.length]= nums[nums[i]% nums.length]+nums.length;
        }
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]/nums.length>1)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] nums={1,1,2};
        System.out.println(duplicacy(nums));
//        for(int i:nums)
//        {
//            System.out.println(i);
//        }
    }
}
