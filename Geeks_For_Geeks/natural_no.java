package Geeks_For_Geeks;
import java.util.*;
public class natural_no {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value");
       long n=scan.nextLong();
       long count=0,check=n;
       String num;
       for(long i=1;i<=check;i++)
       {
           num=Long.toString(i);

//               for(int j=0;j<num.length();j++)               for(int j=0;j<num.length();j++)
//               {
//                   if(num.charAt(j)=='9') {
//                       check=check+1;
//                       count++;
//                   }
//               }
//           if(num.contains("9"))
//           {
//               check=check+1;
//               count++;
//           }
       }
        System.out.println(n+count);
    }
}
