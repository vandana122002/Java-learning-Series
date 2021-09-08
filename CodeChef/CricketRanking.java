package CodeChef;

import java.util.Scanner;

public class CricketRanking {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int R1= scan.nextInt();
            int W1= scan.nextInt();
            int C1= scan.nextInt();
            int R2= scan.nextInt();
            int W2= scan.nextInt();
            int C2= scan.nextInt();
            int count=0,count1=0;
            if(R1<R2)
            {
                count++;
            }else
            {
                count1++;
            }

            if(C1<C2)
            {
                count++;
            }else
            {
                count1++;
            }

            if(W1<W2) {
                count++;
            }else
            {
                count1++;
            }

            if(count>count1)
            {
                System.out.println("B");
            }else
            {
                System.out.println("A");
            }
        }
    }
}
