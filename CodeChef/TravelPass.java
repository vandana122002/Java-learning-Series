package CodeChef;

import java.util.Scanner;

public class TravelPass {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T= scan.nextInt();
        while(T-->0)
        {
            int n= scan.nextInt();
            int a= scan.nextInt();
            int b= scan.nextInt();
            scan.nextLine();
            String s= scan.nextLine();

            int count0=0,count1=0;

            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0')
                {
                    count0++;
                }else
                {
                    count1++;
                }
            }

            System.out.println(count0*a+count1*b);
        }
    }
}
