package CodeChef;

import java.util.Scanner;

public class RichieRich {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int A= scan.nextInt();
            int B=scan.nextInt();
            int X=scan.nextInt();
            System.out.println((B-A)/X);
        }
    }
}
