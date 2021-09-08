package CodeChef;
import java.util.*;
public class Smart_Phone {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long[] arr=new long[n];
        ArrayList<Integer> arr1=new ArrayList<>();
        long ans=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        long max=0;
           for(int i=0;i<n;i++)
           {
               ans=arr[i]*(n-i);
               if(ans>max)
               {
                   max=ans;
               }
        }

        System.out.println(max);
    }
}
