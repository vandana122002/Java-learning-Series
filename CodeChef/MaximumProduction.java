package CodeChef;

import java.util.Scanner;

public class MaximumProduction {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int d=scan.nextInt();
            int x=scan.nextInt();
            int y=scan.nextInt();
            int z=scan.nextInt();
            System.out.println(Math.max(7*x,((y*d)+(z*(7-d)))));
        }
    }
}
