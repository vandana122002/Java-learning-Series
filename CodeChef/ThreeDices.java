package CodeChef;

import java.util.Scanner;

public class ThreeDices {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T= scan.nextInt();
        while(T-->0)
        {
            int a=scan.nextInt();
            int b= scan.nextInt();
            double val=6-(a+b);
            System.out.println(val/6);
        }
    }
}
