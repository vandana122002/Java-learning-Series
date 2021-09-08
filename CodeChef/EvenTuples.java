package CodeChef;

import java.util.Arrays;
import java.util.Scanner;


public class EvenTuples {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int N=scan.nextInt();
            int A= scan.nextInt();
            int[] a=new int[N];
            for(int i=0;i<N;i++)
            {
                a[i]= scan.nextInt();
            }
            Arrays.sort(a);
            while(A-->0)
            {
                int L= scan.nextInt();
                int R= scan.nextInt();
                int[] even=new int[N];
                int[] odd=new int[N];
                int counteven=0,countOdd=0;
                int first=0,sec=0;
                boolean check1=true,check2=true;
                for(int i=0;i<N;i++)
                {
                    if(check1&&a[i]>=L)
                    {
                        first=1;
                        check1=false;
                    }
                    if(check2&&a[i]>=R)
                    {
                        sec=i;
                        check2=false;
                    }
                    if(a[i]%2==0)
                    {
                        counteven++;
                        even[i]=counteven;
                        odd[i]=countOdd;
                    }else
                    {
                        countOdd++;
                        even[i]=counteven;
                        odd[i]=countOdd;
                    }
                }

                int odd_c=0,even_o=0;


//                int eve_no=even[R]-even[L-1];
//                int odd_no=odd[R]-odd[L-1];
//                int fact1=1,fact2,fact3,fact4;
//                for(int i=eve_no;i>(eve_no-3);i--)
//                {
//                    fact1=fact1*i;
//                }
//                fact2=fact1/6;
//                fact1=fact1/eve_no-2;
//                fact3=fact1/2;
//                fact1=fact1/eve_no-1;
//                System.out.println(fact2+(fact3*fact1));

            }
        }
    }
}
