package Practice;

import java.util.*;
public class sumOfSquares {
    public static int Sqaures(int n)
    {
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(Math.pow(i,2)+Math.pow(j,2)==n)
                {
                    ans=1;
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a no");
        int ans=0;
        int num=scan.nextInt();
        for(int i=1;i<=num;i++) {
            if(sumOfSquares.Sqaures(i)==1)
            {
                ans++;
            }
        }
        System.out.println("Ans is "+ans);
    }
}
