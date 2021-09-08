package Practice;

import java.util.*;
public class triangle_star_pattern {
 public static void main(String[] args)
 {
    Scanner scan=new Scanner(System.in);
    int row=scan.nextInt();
    for(int i=1;i<=row;i++)
    {
        for(int j=0;j<row;j++)
        {
            if(j<row-i)
            {
                System.out.print(" ");
            }else
            {
                System.out.print("* ");
            }
        }
        System.out.println();
    }
 }
}
