package CodeChef;

import java.util.Scanner;

public class highest_divisor {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int no=scan.nextInt();
        int count=0;
        for(int i=2;i<=10;i++)
        {
            if(no%i==0)
            {
                count=i;
            }
        }


        System.out.println(count);
    }
}
