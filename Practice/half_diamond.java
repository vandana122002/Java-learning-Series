package Practice;

import java.util.*;
public class half_diamond {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n=scan.nextInt();
        for(int i=1;i<=n-3;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                if(i>j)
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-4;i>0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    System.out.print("* ");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
