package CodeChef;
import java.util.*;
public class Motivation {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0)
        {
            int N=scan.nextInt();
            int X=scan.nextInt();
           int[][] arr=new int[N][2];
            for(int i=0;i<N;i++)
            {
               arr[i][0]=scan.nextInt();
               arr[i][1]=scan.nextInt();
            }
            int max=0;
            for(int i=0;i<N;i++)
            {
                if(arr[i][0]<=X)
                {
                    if(max<arr[i][1]) {
                        max = arr[i][1];
                    }
                }
            }
            System.out.println(max);
            n--;
        }
    }
}
