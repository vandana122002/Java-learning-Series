package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class OrOfAnds {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int N=scan.nextInt();
            int Q=scan.nextInt();
            int next=0;
            int check=Q;
            long[] arr=new long[N];
            int[] index=new int[Q];
            long[] change=new long[Q];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.nextLong();
            }
            for (int i = 0; i < Q; i++) {
                index[i]= scan.nextInt();
                change[i] = scan.nextLong();
            }

            do {
                long org1=arr[0];
                for(int i=1;i<N;i++)
                {
                    org1=org1|arr[i];
                }
                System.out.println(org1);
                if(check>=1) {
                    arr[index[next] - 1] = change[next];
                    next++;
                }
                check--;
            }while(check>=0);

        }
    }
}
