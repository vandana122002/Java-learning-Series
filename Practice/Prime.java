package Practice;

import java.util.*;
public class Prime {
    static boolean isPrime(int n)
    {
        if(n<=0)
        {
            return false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> primes=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the range");
        int range=scan.nextInt();
        int first=0,second=0,third=0;
        boolean ans=false;
        for(int i=2;i<=range;i++)
        {
           if(isPrime(i))
           {
               primes.add(i);
           }
        }
        for(int k=0;k<primes.size();k++)
        {
            if(ans)
            {
                System.out.println(first+" "+second+" "+" "+third);
                break;
            }
             first=primes.get(k);
            for(int j=0;j<primes.size();j++) {
                 second = primes.get(j);
                 third = range - first - second;
                if (isPrime(third)) {
                    ans = true;
                    break;
                }
            }
        }
    }
}
