package Practice;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Practice
{
    static public String smallestnum(String N)
    {
        //code here
        PriorityQueue<Integer> a=new PriorityQueue<>();
        for(int i=0;i<N.length();i++)
        {
            a.add(Character.getNumericValue(N.charAt(i)));
        }
        String zero="";
        String ans="";
           if(a.peek()==0)
           {
               while(a.peek()==0){
               zero=zero+a.remove();
               }
           }
           ans=ans+a.remove();
           ans=ans+zero;
           while(a.size()!=0)
           {
               ans=ans+a.remove();
           }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(smallestnum(s));
    }
}
