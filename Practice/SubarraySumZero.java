package Practice;

import java.util.Scanner;

public class SubarraySumZero {

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<10;i++)
        {
            sum=arr[i];
            for(int j=i+1;j<10;j++)
            {
                if(sum==0)
                {
                    System.out.println("Subarray exsist from "+i+j);
                    sum=sum+arr[j];
                    break;
                }else
                {
                    sum=sum+arr[j];
                }
            }
            sum=0;
        }
    }
}
