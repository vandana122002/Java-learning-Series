package Practice;
import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        try
        {
            int x=scan.nextInt();
            int y=scan.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e)
        {
            System.out.println(e);
        }catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}