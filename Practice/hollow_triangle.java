package Practice;

import java.util.*;
public class hollow_triangle {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<n;i++)
        {
            System.out.print("*");
            for(int j=i-1;j>0;j--)
            {
                System.out.print("  ");
            }
            if(i!=1)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++)
        {
            System.out.print("* ");
        }
    }
}
