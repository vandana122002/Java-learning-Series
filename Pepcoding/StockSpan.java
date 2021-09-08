package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }

        for(int i=n-1;i>=0;i--)
        {
            while(!s.empty()&&arr[s.peek()]<arr[i])
            {
                int val=s.pop();
                arr[val]=val-i;
            }
            s.push(i);
        }

        while(!s.empty())
        {
            int val=s.pop();
            arr[val]=val+1;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
