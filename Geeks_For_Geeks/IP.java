package Geeks_For_Geeks;

import java.util.Scanner;

public class IP {
    static boolean check(String s)
    {
        String value="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='.')
            {
                value+=s.charAt(i);
                continue;
            }
             if(value.length()==1)
            {
                if(value.charAt(0)>=97&&value.charAt(0)<=123||value.charAt(0)>=65&&value.charAt(0)<=91)
                {
                    return false;
                }
            } else if(value.length()==2)
            {
                if(value.charAt(0)=='0'||value.charAt(0)>=97&&value.charAt(0)<=123||value.charAt(0)>=65&&value.charAt(0)<=91||value.charAt(1)>=97&&value.charAt(1)<=123||value.charAt(1)>=65&&value.charAt(1)<=91)
                {
                    return false;
                }
            }else if(value.length()==3)
             {
                 if(value.charAt(0)=='0'||value.charAt(0)>=97&&value.charAt(0)<=123||value.charAt(0)>=65&&value.charAt(0)<=91||value.charAt(1)>=97&&value.charAt(1)<=123||value.charAt(2)>=65&&value.charAt(2)<=91||value.charAt(2)>=97&&value.charAt(2)<=123)
                 {
                     return false;
                 }
                 int val=Integer.valueOf(value);
                 if(!(val>=0&&val<=255))
                 {
                     return false;
                 }
             }else if(value.length()<1||value.length()>3)
             {
                 return false;
             }
            count++;
                value="";
        }
        if (count!=3) return false;
        if(value.length()==1)
        {
            if(value.charAt(0)>=97&&value.charAt(0)<=123||value.charAt(0)>=65&&value.charAt(0)<=91)
            {
                return false;
            }
        } else if(value.length()==2)
        {
            if(value.charAt(0)=='0'||value.charAt(0)>=97&&value.charAt(0)<=123||value.charAt(0)>=65&&value.charAt(0)<=91||value.charAt(1)>=97&&value.charAt(1)<=123||value.charAt(1)>=65&&value.charAt(1)<=91)
            {
                return false;
            }
        }else if(value.length()==3)
        {
            if(value.charAt(0)=='0'||value.charAt(0)>=97&&value.charAt(0)<=123||value.charAt(0)>=65&&value.charAt(0)<=91||value.charAt(1)>=97&&value.charAt(1)<=123||value.charAt(2)>=65&&value.charAt(2)<=91||value.charAt(2)>=97&&value.charAt(2)<=123)
            {
                return false;
            }
            int val=Integer.valueOf(value);
            if(!(val>=0&&val<=255))
            {
                return false;
            }
        }else if(value.length()<1||value.length()>3)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        if(check(s))
        {
            System.out.println("1");
        }else
        {
            System.out.println("0");
        }
    }
}
