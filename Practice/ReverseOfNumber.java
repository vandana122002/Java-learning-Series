package Practice;

import java.util.*;
public class ReverseOfNumber {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        int reversenum=0;
        while(num!=0)
        {
            int ld=num%10;
            reversenum=reversenum*10+ld;
            num=num/10;
        }
        System.out.println("Reverse of number is "+reversenum);
    }
}
