package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        StringBuilder aj=new StringBuilder(s);
        aj=aj.reverse();
        StringBuilder ans=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<aj.length();i++)
        {
            if(aj.charAt(i)==')')
            {
                st.push(aj.charAt(i));
            }else if(aj.charAt(i)=='(')
            {
               while(st.peek()!=')')
               {
                   ans.append(st.pop());
               }
               st.pop();
            }else if(aj.charAt(i)=='^')
            {
                st.push(aj.charAt(i));
            }else if(aj.charAt(i)=='+'||aj.charAt(i)=='-')
            {
                while(!st.empty()&&st.peek()!=')'&&st.peek()!='+'&&st.peek()!='-')
                {
                    ans.append(st.pop());
                }
                st.push(aj.charAt(i));
            }else if(aj.charAt(i)=='*'||aj.charAt(i)=='/')
            {
                while(!st.isEmpty()&&st.peek()=='^')
                {
                    ans.append(st.pop());
                }
                st.push(aj.charAt(i));
            }else
            {
                ans.append(aj.charAt(i));
            }
        }
        while(!st.empty())
        {
            ans.append(st.pop());
        }
        System.out.println(ans.reverse());
    }
}
