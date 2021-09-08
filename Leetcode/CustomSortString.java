package Leetcode;

import java.util.Scanner;

public class CustomSortString {
    static String ans(String order,String str)
    {
        String ans="";
        for(int i=0;i<order.length();i++)
        {
            for(int j=0;j<str.length();j++)
            {
                System.out.println(j);
                if(order.charAt(i)==str.charAt(j))
                {
                        ans+=str.charAt(j);
                }
            }
            str=str.replaceAll(order.substring(i,i+1),"");
        }
        ans+=str;
        return ans;
    }
    public static void main (String[] args) {
        //code
        Scanner scan=new Scanner(System.in);
        String order=scan.nextLine();
        String str= scan.nextLine();
        System.out.println(ans(order,str));
    }
}
