package Practice;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        //A Simple Hello World

        //Getting input via STDIN
        Stack<Integer> q=new Stack<>();
        Scanner obj = new Scanner(System.in);
        int num=obj.nextInt();
//        while(num!=0)
//        {
//            if(num%10==0)
//            {
//                q.push(5);
//                num=num/10;
//            }else
//            {
//                q.push(num%10);
//                num=num/10;
//            }
//        }
//
//        while(!q.isEmpty())
//        {
//            num=num*10+q.pop();
//        }
//        System.out.println(num);

        String s=Integer.toString(num);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                s=s.substring(0,i)+'5'+s.substring(i+1);
            }
        }
        System.out.println(s);

    }
}