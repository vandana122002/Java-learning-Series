package  Practice;
import java.util.*;


public class ParenthesisBalencer {
    static boolean parenthesis(String x)
    {
        Stack<Character> s=new Stack<>();
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)=='{'||x.charAt(i)=='['||x.charAt(i)=='(')
            {
                s.push(x.charAt(i));
            }


            if(s.empty())
            {
                return false;
            }
            switch(x.charAt(i))
            {
                case '}':
                    if(s.peek()=='{')
                    {
                        s.pop();
                    }else
                    {
                        return false;
                    }
                    break;
                case ')':
                    if(s.peek()=='(')
                    {
                        s.pop();
                    }else
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(s.peek()=='[')
                    {
                        s.pop();
                    }else
                    {
                        return false;
                    }
                    break;
            }
        }
        return s.empty();
    }
    public static void main(String args[] ) throws Exception {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        while(n-->0)
        {
            String s=scan.nextLine();
            if(parenthesis(s))
            {
                System.out.println("balanced");
            }else
            {
                System.out.println("not balanced");
            }

        }
    }
}