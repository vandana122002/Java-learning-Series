package Practice;

import java.util.Scanner;

public class checkKthTermRotate {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k= scan.nextInt();

        int temp=n;
        int node=0;
        while(temp>0)
        {
            temp=temp/10;
            node++;
        }
        k=k%node;
        if(k<0)
        {
           k=k*node;
        }
        int div=1;
        int mult=1;
        for(int i=1;i<=node;i++)
        {
            if(i<=k)
            {
                div=div*10;
            }else
            {
                mult=mult*10;
            }
        }

        int q=n/div;
        int r=n%div;
        int rot=r*mult+q;
        System.out.println(rot);
    }
}
