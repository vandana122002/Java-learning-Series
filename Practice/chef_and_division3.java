package Practice;

import java.io.*;
import java.util.*;

class chef_and_division3{
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            while(n>0)
            {
                int N=scan.nextInt();
                int k=scan.nextInt();
                int D=scan.nextInt();
                int[] arr=new int[N];
                int sum=0;
                for(int i=0;i<N;i++)
                {
                    arr[i]=scan.nextInt();
                }
                for(int i=0;i<N;i++)
                {
                    sum=sum+arr[i];
                }
                if(sum<k)
                {
                    System.out.println("0");
                }else
                {
                    int ans=sum/k;
                    if(ans>D)
                    {
                        System.out.println(D);
                    }else
                    {
                        System.out.println(ans);
                    }
                }
                n--;
            }
            //Your Solve
        } catch (Exception e) {
            return;
        }
    }

}

