package Practice;

import java.util.*;
public class Bubble {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=scan.nextInt();
        System.out.println("Enter the array");
         int[] array=new int[n];
         for(int i=0;i<n;i++)
         {
             array[i]=scan.nextInt();
         }
        for(int i=0;i<n-2;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp=array[j];
                    array[j]=array[j+1];
                   array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
