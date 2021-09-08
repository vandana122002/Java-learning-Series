package Leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class ThirdMaximumNo {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=b.readLine().trim().split(" ");
        Stack<Integer> ans=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            ans.add(Integer.parseInt(arr[i]));
        }
//        int count=0;
//        if(ans.length==2)
//        {
//            System.out.println(ans[1]);
//        }else
//        {
//            for(int i=0;i<ans.length;i++) {
//                while (count != 3) {
//                    if
//                }
//            }
//        }
    }
}
