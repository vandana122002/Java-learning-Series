package CodeChef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class balance {
    /* package codechef; // don't place package name! */


    /* Name of the class has to be "Main" only if the class is public. */

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner scan=new Scanner(System.in);
            double amount=scan.nextDouble();
            double balance=scan.nextDouble();
            double remaining;
            if(amount%5==0&&amount<=balance)
            {
                remaining=balance-(amount+0.50);
                System.out.format("%.2f",remaining);

            }else
            {
                System.out.format("%.2f",balance);
            }
        }


}
