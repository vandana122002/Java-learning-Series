package Java_ds_algo.Java;
import java.util.*;
public class remove_duplicate_from_sorted_array {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=scan.nextInt();
        System.out.println("Enter the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int i=0,j=1;
            while(n>j)
            {
                if(arr[i]==arr[j])
                {
                    j++;
                }else
                {
                    i++;
                    arr[i]=arr[j];
                    j++;
                }
        }

      for(int a=0;a<=i;a++)
      {
          System.out.print(arr[a]+" ");
      }
    }
}
