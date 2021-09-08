package Geeks_For_Geeks;

import java.util.*;

public class InfixToPostfix {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String infix=scan.nextLine();
        Stack<Character> s=new Stack<>();
        String postfix="";
        for(int i=0;i<infix.length();i++)
        {
            if(infix.charAt(i)>=65&&infix.charAt(i)<=90||infix.charAt(i)>=97&&infix.charAt(i)<=122)
            {
                postfix=postfix+infix.charAt(i);
            }else if(infix.charAt(i)=='+'||infix.charAt(i)=='-')
            {
                while(!s.empty()&&s.peek()!='(')
                {
                    postfix=postfix+s.pop();
                }
                s.push(infix.charAt(i));
            }else if(infix.charAt(i)=='*'||infix.charAt(i)=='/')
            {
                while (!s.empty()&&(s.peek()=='/'||s.peek()=='^'||s.peek()=='*'))
                {
                    postfix=postfix+s.pop();
                }
                s.push(infix.charAt(i));
            }
            else if(infix.charAt(i)==')')
            {
                while (!s.empty()&&s.peek()!='(')
                {
                    postfix=postfix+s.pop();
                }
                s.pop();
            }else
            {
                s.push(infix.charAt(i));
            }
        }
        while (!s.empty())
        {
            postfix=postfix+s.pop();
        }
        System.out.println(postfix);
    }
}
