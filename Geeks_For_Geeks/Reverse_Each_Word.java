package Geeks_For_Geeks;
import java.util.*;
public class Reverse_Each_Word {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String S=scan.nextLine();
        Stack<String> s=new Stack<>();
        String newstr="";
        for(int i=0;i<S.length();i++)
        {
            if(!(S.charAt(i)=='.')){
            s.push(S.substring(i,i+1));}
            else
            {
                while(!s.empty())
                {
                    newstr=newstr+s.pop();
                }
                newstr=newstr+".";
            }
        }
        while(!s.empty())
        {
            newstr=newstr+s.pop();
        }
        System.out.println(newstr);

    }
}
