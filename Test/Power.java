package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power {
    static double power(double a,int k)
    {
        if(k==0)
        {
            return 1;
        }else if(k%2==0)
        {
            return power(a*a,k/2);
        }else
        {
            return power(a*a,(k-1)/2)*a;
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no");
        double a=Double.valueOf(b.readLine());
        System.out.println("Enter the pow");
        int k=Integer.valueOf(b.readLine());
        System.out.println(power(a,k));

    }
}
