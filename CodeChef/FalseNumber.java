package CodeChef;

import java.util.Scanner;

public class FalseNumber {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        scan.nextLine();
        while(T-->0)
        {
            String s= scan.nextLine();
            if(s.charAt(0)=='1')
            {
                s=s.substring(0,1)+"0"+s.substring(1);
            }else
            {
                s="1"+s;
            }
            System.out.println(s);
        }
    }
}
