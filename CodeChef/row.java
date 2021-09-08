package CodeChef;
import java.util.*;
public class row {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        while(a>0)
        {
            int n=scan.nextInt();
            int m=scan.nextInt();
            long x=scan.nextLong();
            long[][] arr=new long[1][m];
            arr[0][0]=1;
            for(int i=1;i<m;i++)
            {
                arr[0][i]=arr[0][i-1]+n;
            }
//            for(int i=0;i<m;i++)
//            {
//                System.out.println(arr[0][i]);
//            }
            int equal=0;
            long count=0,value=0,newCount=0;
            for(int i=0;i<m;i++)
            {
                if(arr[0][i]<x)
                {
                    count++;
                    value=arr[0][i];
                }else if(arr[0][i]==x)
                {
                    equal=1;
                    count++;
                    break;
                }
                else
                {
                    break;
                }
            }
            if(equal==0) {
                newCount = count;
                newCount = newCount + (m - count);
                    newCount = newCount +((x-value)-1)*m;
                newCount = newCount + count;
                System.out.println(newCount);
            }else
            {
                System.out.println(count);
            }
            a--;
        }
    }
}
