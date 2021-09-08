package Practice;

import java.util.*;
public class number_triangle_pattern {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n=scan.nextInt();
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<n-i)
                {
                    System.out.print(" ");
                }else
                {
                    System.out.print(count+" ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
