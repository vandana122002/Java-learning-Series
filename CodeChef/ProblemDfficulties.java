package CodeChef;

import java.lang.reflect.Array;
import java.util.*;

public class ProblemDfficulties {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        while(T-->0)
        {
            int[] a=new int[4];
            for(int i=0;i<4;i++)
            {
                a[i]=scan.nextInt();
            }
            Arrays.sort(a);
            if(a[0]==a[1]&&a[1]==a[2]&&a[2]==a[3])
            {
                System.out.println("0");
            }else if(a[0]!=a[1]&&a[1]==a[2]&&a[2]==a[3]||a[0]==a[1]&&a[1]==a[2]&&a[2]!=a[3])
            {
                System.out.println("1");
            }else
            {
                System.out.println("2");
            }
        }
    }
}
