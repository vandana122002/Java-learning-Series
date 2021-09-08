package CodeChef;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BenchPress {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int T = scan.nextInt();
        while (T-- > 0) {
          int A=scan.nextInt();
          int B=scan.nextInt();
          int c= scan.nextInt();
          int[] s1=new int[A];
          for(int i=0;i<A;i++)
          {
              s1[i]= scan.nextInt();
          }
            Arrays.sort(s1);
          if(B<=c)
          {
              System.out.println("YES");
          }else
          {
              long sum=0;
              long Remaining=B-c;
              for(int i=0;i<A-1;i++)
              {
                  if(s1[i]==s1[i+1])
                  {
                      sum=sum+s1[i]+s1[i+1];
                      if(sum<Remaining)
                      {
                          i=i+1;
                      }
                  }
              }
              if(sum>=Remaining)
              {
                  System.out.println("YES");
              }else
              {
                  System.out.println("NO");
              }

          }
        }
    }
}
