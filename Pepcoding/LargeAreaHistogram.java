package Pepcoding;

import java.util.Stack;

public class LargeAreaHistogram {
    public static void main(String[] args)
    {
        int[] arr={6,2,5,4,5,1,6};

        Stack<Integer> s=new Stack<>();
        int[] ans=new int[arr.length];
        int[] ans1=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            while(!s.empty()&&arr[s.peek()]>arr[i])
            {
                int val=arr[s.peek()];
                ans[s.peek()]=(i-s.pop())*val;
            }
            s.push(i);
        }
        while(!s.empty())
        {
            ans[s.peek()]=(arr.length-s.peek())*arr[s.pop()];
        }
//        for(int i:ans)
//        {
//            System.out.println(i);
//        }

        //Backward checking
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!s.empty()&&arr[s.peek()]>arr[i])
            {
                int val=arr[s.peek()];
                ans1[s.peek()]=(s.pop()-i-1)*val;
            }
            s.push(i);
        }


//        System.out.println("ans");
        while(!s.empty())
        {
            ans1[s.peek()]=(s.peek())*arr[s.pop()];
        }

//        for(int i:ans1)
//        {
//            System.out.println(i);
//        }

        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum;
                sum=ans[i]+ans1[i];
//            System.out.println("sum is "+sum);
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.println(max);
    }
}
