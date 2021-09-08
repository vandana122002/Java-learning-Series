package CodeChef;
import java.util.*;
public class Coin_Flip {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0)
        {
            int G=scan.nextInt();
            while(G>0)
            {
                int I=scan.nextInt();
                int N=scan.nextInt();
                int Q=scan.nextInt();
                String[] arr=new String[N];

                if(I==1)
                {
                    Arrays.fill(arr,"H");
                }else
                {
                    Arrays.fill(arr,"T");
                }
                int head,tail;
                  if(N%2==0)
                  {
                      head=N/2;
                      tail=N/2;
                  }else
                  {
                      head=N/2;
                      tail=(N/2)+1;
                  }
                  if(Q==1)
                  {
                      System.out.println(head);
                  }else{
                      System.out.println(tail);
                  }
                G--;
            }
            n--;
        }
    }
}
