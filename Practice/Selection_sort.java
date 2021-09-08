package Practice;

import java.util.Scanner;

public class Selection_sort {
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
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
