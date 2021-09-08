package Pepcoding;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        Stack<Character> st=new Stack<>();
        boolean check=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
            {
                if(st.isEmpty())
                {
                    System.out.println("false");
                    return;
                }else {
                    Character c = s.charAt(i);
                    switch (c) {
                        case ')':
                            if (st.peek() == '(')
                                st.pop();
                            else
                            {
                                System.out.println("false");
                                return ;
                            }
                            break;
                        case ']':
                            if (st.peek() == '[')
                                st.pop();
                            else
                            {
                                System.out.println("false");
                                return;
                            }
                            break;
                        case '}':
                            if (st.peek() == '{')
                                st.pop();
                            else
                            {
                                System.out.println("false");
                               return;
                            }
                            break;
                    }
                }
            }
        }
        if(st.isEmpty())
        {
            System.out.println("true");
        }else
        {
            System.out.println("false");
        }

    }
}
