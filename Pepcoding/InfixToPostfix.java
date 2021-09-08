package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Stack<Character> st=new Stack<>();
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='+'||s.charAt(i)=='-')
            {
                while(!st.empty()&&st.peek()!='(')
                {
                    ans.append(st.pop());
                }
                st.push(s.charAt(i));
            }else if(s.charAt(i)=='*'||s.charAt(i)=='/')
            {
                while(!st.empty()&&st.peek()!='('&&st.peek()!='+'&&st.peek()!='-')
                {
                    ans.append(st.pop());
                }
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')')
            {
                while(st.peek()!='(')
                {
                    ans.append(st.pop());
                }
                st.pop();
            }else if(s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
            }else if(s.charAt(i)=='^')
            {
                while(!st.empty()&&st.peek()!='(')
                {
                    ans.append(st.pop());
                }
                st.push(s.charAt(i));
            }else
            {
                ans.append(s.charAt(i));
            }
        }
        while(!st.empty())
        {
            ans.append(st.pop());
        }
        System.out.println(ans);
    }
}
