package Pattern;

import Java_ds_algo.Java.Linkedlist;

import java.util.HashMap;
import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int count=(2*(n-1))/2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2*(n-1)+1;j++)
            {
                if(j>=count-i&&j<=count+i)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
