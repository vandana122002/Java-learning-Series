package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class Infix {
    static int ans(int a,int b,Character opr)
    {
        switch (opr)
        {
            case'+':
                return a+b;
            case'-':
                return a-b;
            case'*':
                return a*b;
            case'/':
                return a/b;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Stack<Character> operator=new Stack<>();
        Stack<Integer> operand=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==')')
            {
                while(operator.peek()!='(')
                {
                    int b=operand.pop();
                    int a=operand.pop();
                    operand.push(ans(a,b,operator.pop()));
                }
                operator.pop();
            }else if(s.charAt(i)=='+'||s.charAt(i)=='-')
            {
                while(operator.size()>0&&operator.peek()!='(')
                {
                    int b=operand.pop();
                    int a=operand.pop();
                    operand.push(ans(a,b,operator.pop()));
                }
                operator.push(s.charAt(i));
            }else if(s.charAt(i)=='*'||s.charAt(i)=='/')
            {

                while(operator.size()>0&&operator.peek()!='('&&operator.peek()!='+'&&operator.peek()!='-')
                {
                    int b=operand.pop();
                    int a=operand.pop();
                    operand.push(ans(a,b,operator.pop()));
                }
                operator.push(s.charAt(i));
            }else if(s.charAt(i)=='(')
            {
                operator.push(s.charAt(i));
            }else if(Character.isDigit(s.charAt(i)))
            {
                operand.push(s.charAt(i)-'0');
            }
        }

        while(operand.size()>0&&operator.size()>0) {
            int b = operand.pop();
            int a = operand.pop();
            operand.push(ans(a, b, operator.pop()));
        }
        System.out.println(operand.pop());
    }
}
