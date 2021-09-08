package CodeChef;

import java.util.Scanner;

public class Xxoorr {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T= scan.nextInt();
        while(T-->0)
        {
            int N=scan.nextInt();
            int K=scan.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N;i++)
            {
                arr[i]=scan.nextInt();
            }
            int[] ans=new int[33];
            int count=32;
            for(int i=0;i<N;i++)
            {
                while(arr[i]!=0)
                {
                    ans[count]+=(arr[i]%2);
                    arr[i]=arr[i]/2;
                    count--;
                }
                count=32;
            }
            int sum=0;
            for(int i=0;i<33;i++)
            {
                if(ans[i]%K==0)
                {
                    sum+=ans[i]/K;
                }else
                {
                   sum+=ans[i]/K+1;
                }
            }
            System.out.println(sum);
        }
    }
}
