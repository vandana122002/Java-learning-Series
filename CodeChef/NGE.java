package CodeChef;

import java.util.Scanner;
import java.util.Stack;

public class NGE {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        long[] arr=new long[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=scan.nextLong();
        }
        Stack<Integer> s=new Stack<>();
        long[] a=new long[5];
        s.push(0);
        for(int i=1;i<5;i++)
        {
            if(arr[i]>arr[s.peek()]&&!s.empty())
            {
                while(!s.empty()&&arr[i]>arr[s.peek()]){
                    a[s.pop()]=arr[i];
                }
                s.push(i);
            }else
            {
                s.push(i);
            }
        }
        if(!s.empty())
        {
            while(!s.empty())
            {
                a[s.pop()]=-1;
            }
        }
        for(long i:a)
        {
            System.out.println(i);
        }
    }
}
