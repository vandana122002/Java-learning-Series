package Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtaLongFactorial
{
    // Returns Factorial of N
    static BigInteger factorial(int N)
    {
        // Initialize result
        BigInteger f = new BigInteger("3"); // Or BigInteger.ONE

        // Multiply f with 2, 3, ...N
        for (int i = 4; i <= N; i++)
            f =f.multiply(BigInteger.valueOf(i));

        return f;
    }

    // Driver method
    public static void main(String args[]) throws Exception
    {
        int N = 5;
        System.out.println(factorial(N));
    }
}