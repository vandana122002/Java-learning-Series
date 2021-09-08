package Java_ds_algo.algo;
import java.util.*;

public class two_pointer_algorithm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array");
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<5;i++)
        {
            if(check(arr,-arr[0],i+1))
            {
                System.out.println("true");
            }
        }
    }
    static boolean check(int arr[],int n,int x)
    {
        int j=arr.length-1;
        while(j>x)
        {
           if(arr[x]+arr[j]>n)
           {
               j--;
           }else if(arr[x]+arr[j]<n)
           {
               x++;
           }else
           {
               return true;
           }
        }
        return false;
    }
}