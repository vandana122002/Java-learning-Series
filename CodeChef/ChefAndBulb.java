package CodeChef;

import java.util.Scanner;

public class ChefAndBulb {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            long count=0;
            long N=scan.nextLong();
            long P=scan.nextLong();
            long K=scan.nextLong();
            long rem=P%K;
            long y=((N-1)-(((N-1)/K)*K));
            if(rem>y) {
                count += (y + 1) * (((N - 1) / K) + 1);
                count += (rem - 1 - y) * ((N - 1) / K);
            }else
            {
                count+=rem*(((N - 1) / K) + 1);
            }
            long n=(P-rem+K)/K;
            count+=n;
            System.out.println(count);
        }
    }
}
