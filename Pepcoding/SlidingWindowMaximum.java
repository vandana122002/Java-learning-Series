package Pepcoding;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {
    public static void main(String[] args)
    {
        int[] arr={2,9,3,8,1,7,12,6,14,4,32,0,7,19,8,12,6};
        int k=5;
        int[] ans=new int[arr.length-(k-1)];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length-(k-1);i++)
        {
            while(!s.empty()&&arr[s.peek()]<arr[i])
            {
                ans[s.pop()]=i;
            }
            s.push(i);
        }
        while(!s.empty())
        {
            ans[s.pop()]=-1;
        }
//        int j;
//        for(int i=0;i<arr.length-(k-1);i++)
//        {
//            j=i;
//            int window=i+k;
//            while(ans[j]<window) {
//                if(ans[j]==-1)
//                {
//                    break;
//                }
//                  j=ans[j];
////                System.out.println(j+" "+ans[j]);
//            }
////            System.out.println("i is "+i);
//            ans[i]=arr[j];
//        }
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}
