package CodeChef;

import java.util.Scanner;

public class ProgrammingLanguages {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int a=scan.nextInt();
            int b= scan.nextInt();
            int a1= scan.nextInt();
            int b1= scan.nextInt();
            int a2= scan.nextInt();
            int b2= scan.nextInt();
            if((a==a1&&b==b1)||(a==b1&&b==a1))
            {
                System.out.println("1");
            }else if((a==a2&&b==b2)||(a==b2&&b==a2))
            {
                System.out.println("2");
            }else
            {
                System.out.println("0");
            }

        }
    }
}
