package Practice;

import java.util.*;
public class Factor {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int answer=0;
        int originalno=n;
        while(n!=0)
        {
            int remainder=n%10;
            if(remainder==0)
            {
                continue;
            }
            if(originalno%remainder==0)
            {
                answer++;
            }
            n=n/10;
        }
        System.out.println("Answer is "+answer);
    }
}
