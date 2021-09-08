package Practice;

import java.util.Scanner;

public class FCFS {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] at=new int[5];
        int[] bt=new int[5];
        int[] ct=new int[5];
        int avtat=0;

        System.out.println("Enter the arrival Time");
        for(int i=0;i<5;i++)
        {
            at[i]=scan.nextInt();
        }
        System.out.println("Enter the burst Time");
        for(int i=0;i<5;i++)
        {
            bt[i]=scan.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(at[i]>at[j])
                {
                    int temp=at[j];
                    at[j]=at[i];
                    at[i]=temp;
                    temp=bt[j];
                    bt[j]=bt[i];
                    bt[i]=temp;
                }
            }
        }
    }
}
