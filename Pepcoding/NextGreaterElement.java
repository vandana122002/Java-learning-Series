package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
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
        for(int i=0;i<n;i++)
        {
            while(!s.empty()&&arr[s.peek()]<arr[i])
            {
                arr[s.pop()]=arr[i];
            }
            s.push(i);
        }

        while(!s.empty())
        {
            arr[s.pop()]=-1;
        }
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
}
