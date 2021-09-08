package CodeChef;

import java.util.Scanner;

public class ChessFromat {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int a=scan.nextInt();
            int b=scan.nextInt();
            if(a+b<3)
            {
                System.out.println("1");
            }else if(3<=a+b&&a+b<=10)
            {
                System.out.println("2");
            }else if(11<=a+b&&a+b<=60)
            {
                System.out.println("3");
            }else
            {
                System.out.println("4");
            }
        }
    }
}
