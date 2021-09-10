package CodeChef;

import java.util.Scanner;

public class AirlineRestrictions {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T= scan.nextInt();
        while (T-->0)
        {
            int a= scan.nextInt();
            int b= scan.nextInt();
            int c= scan.nextInt();
            int d= scan.nextInt();
            int e= scan.nextInt();
            if(a<=e&&b+c<=d)
            {
                System.out.println("Yes");
            }else if(b<=e&&a+c<=d)
            {
                System.out.println("Yes");
            }else if(c<=e&&a+b<=d)
            {
                System.out.println("Yes");
            }else
            {
                System.out.println("No");
            }
        }
    }
}
