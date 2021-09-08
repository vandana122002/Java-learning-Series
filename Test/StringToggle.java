package Test;

import java.io.*;

public class StringToggle {
    static void stringToggle(String s)
    {
        if(s.length()==0)
        {
            return ;
        }else if(s.charAt(0)>=65&&s.charAt(0)<=91)
        {
            System.out.print((char)((int)s.charAt(0)+32));
            stringToggle(s.substring(1));
        }else
        {
            System.out.print((char)((int)s.charAt(0)-32));
            stringToggle(s.substring(1));
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        String s=b.readLine();
        stringToggle(s);
    }
}
