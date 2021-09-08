package Geeks_For_Geeks;

public class BitDifference {
    public static void main(String[] args)
    {
        long sum=0;
        int[] nums={23,25,21,18};
        int[] arr=new int[63];
        int count=62;
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=0)
            {
                arr[count]+=nums[i]%2;
                nums[i]=nums[i]/2;
                count--;
            }
            count=62;
        }
        for(int i=0;i<63;i++)
        {
           if(arr[i]==0&&arr[i]==nums.length)
           {
               continue;
           }else
           {
               sum+=(arr[i]*(nums.length-arr[i])*2);
           }
        }
        System.out.println(sum);
    }
}
