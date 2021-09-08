package Practice;

import java.util.Scanner;

public class Insertion_sort {
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
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(array[j]>array[i])
                {
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }else
                {
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
