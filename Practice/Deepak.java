package Practice;

import java.util.*;
public class Deepak {
    public static double nilakKanthaSum(double n)
    {
        double ans=3;
       for(float i=2;i<1000;i=i+2)
       {
           double value=Math.abs((float)4/(i*(i+1)*(i+2)));
           if(value<n&&i%4==0)
           {
               ans=ans-value;
               break;
           }else if(value<n&&i%4!=0)
           {
               ans=ans+value;
               break;
           }
           if(i%4==0) {
               ans = ans - value;
           }else
           {
               ans = ans + value;
           }
       }
       return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a no");
        double num=scan.nextFloat();
        System.out.println(Deepak.nilakKanthaSum(num));
    }
}
