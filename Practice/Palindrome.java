package Practice;

import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String value=scan.nextLine();
        String[] arr=value.split(" ");
        int ans=0;
        String reversevlue="";
        for(int i=value.length()-1;i>=0;i--)
        {
            reversevlue=reversevlue+value.charAt(i);
        }
        System.out.println("Reverse string is "+reversevlue);
        if(value.equals(reversevlue))
        {
            System.out.println("String is palindrome");
        }else
        {
            System.out.println("String is not Practice.Palindrome");
        }
    }
}
