package Leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Height_checker {
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=b.readLine().trim().split(" ");
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(ans);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Integer.parseInt(arr[i])!=ans[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
