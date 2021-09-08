package Practice;

import java.util.*;

public class gcdAndLcm{

    static int gcd(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }

    public static void main(String[] args) {
        // write your code here
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        if(a>b)
        {
            System.out.println("gcd "+gcd(a,b));
            System.out.println("lcm "+(a*b)/gcd(a,b));
        }else
        {
            System.out.println("gcd "+gcd(b,a));
            System.out.println("lcm "+(a*b)/gcd(b,a));
        }
    }
}