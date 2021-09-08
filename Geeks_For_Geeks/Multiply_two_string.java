package Geeks_For_Geeks;
import java.util.*;
public class Multiply_two_string{
    static String atoi(String s1,String s2)
    {
        // Your code here
         int m=s1.length();
         int n=s2.length();
         int[] result=new int[m+n];
         int len=m+n+1;
         int carry=0;
         boolean minus=false;
         for(int i=0;i<n;i++)
         {
             int val1=Character.getNumericValue(s2.charAt(m-1-i));
             for(int j=0;j<m;j++)
             {
                 int val2=Character.getNumericValue(s1.charAt(n-1-j));
                 int val3=val1*val2;
                 val3=val3+carry;
                 if(val3>9) {
                     carry = val3 / 10;
                     result[len - j - 1-i] += val3 % 10;
                 }else
                 {
                     result[len - j - 1-i] += val3;
                 }
             }
         }
         String ans="";
         for(int i:result)
         {
             ans=ans+i;
         }
         return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String str2=scan.next();
        System.out.println(atoi(str,str2));
    }
}
