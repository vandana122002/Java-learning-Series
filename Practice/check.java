package Practice;

import java.io.*;
import java.util.*;

class Main
{
    static char findAlphabet(String s)
    {
        char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
        int start=0,end=alphabets.length-1,mid;
        for(int i=0;i<s.length();i++)
        {
            mid=(start+end) /2;
            if(s.charAt(i)=='0')
            {
                end=mid-1;
            }else
            {
                start=mid+1;
            }
        }
        if(start+1==end||end+1==start||start==end)
        {
            return alphabets[start];
        }
        return 'w';
    }
    public static void main(String[] args) throws IOException
    {
        try{
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            scan.nextLine();
            while(n>0)
            {
                int Length=scan.nextInt();
                scan.nextLine();
                String s=scan.nextLine();
                for(int i=0;i<s.length();i=i+4)
                {
                    char ans=findAlphabet(s.substring(i,i+4));
                    System.out.print(ans);
                }
                System.out.println();
                n--;
            }
            //Your Solve
        }catch(Exception e){
            return;
        }
    }
}
