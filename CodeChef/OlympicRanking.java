package CodeChef;

import java.util.Scanner;

public class OlympicRanking {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int G1=scan.nextInt();
            int S1=scan.nextInt();
            int B1=scan.nextInt();
            int G2=scan.nextInt();
            int S2=scan.nextInt();
            int B2=scan.nextInt();
            int sum1=G1+S1+B1;
            int sum2=G2+S2+B2;
            if(sum1>sum2)
            {
                System.out.println("1");
            }else
            {
                System.out.println("2");
            }
        }
    }
}
