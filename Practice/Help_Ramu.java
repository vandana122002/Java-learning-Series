package Practice;

import java.util.*;
public class Help_Ramu {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        while(N>0)
        {
            int c1=scan.nextInt();
            int c2=scan.nextInt();
            int c3=scan.nextInt();
            int c4=scan.nextInt();
            int n=scan.nextInt();
            int m=scan.nextInt();
            int[] arr=new int[n];
            int[] arr1=new int[m];
            for(int i=0;i<n;i++)
            {
                arr[i]=scan.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                arr1[i]=scan.nextInt();
            }
            int rickshaw=0,cabs=0;
            for(int i=0;i<n;i++) {
                rickshaw += Math.min(arr[i] * c1, c2);
            }
            rickshaw=Math.min(rickshaw,c3);

            for(int i=0;i<m;i++) {
                cabs += Math.min(arr1[i] * c1, c2);
            }
            cabs=Math.min(cabs,c3);
            System.out.println(Math.min(rickshaw+cabs,c4));
            N--;
        }
    }
}
