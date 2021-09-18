package Practice;

import java.util.Scanner;

public class SwatiMonkeyJump {
    static int maxValue(int[] arr,int s,int e)
    {
        if(s>arr.length||e>arr.length)
        {
            return -1;
        }
        int maxIndex=s;
        for(int i=s+1;i<=e;i++)
        {
            if(arr[maxIndex]<arr[i])
            {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int[] arr=new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]= scan.nextInt();
        }

        int move=0,i=0,ans=arr[0];
        boolean check=true;
        while(i<arr.length-1)
        {
            if(ans==0)
            {
                System.out.println("-1");
                check=false;
                break;
            }
            ans=maxValue(arr,i+1,arr[i]+i);
            if(ans==-1)
            {
                move++;
                break;
            }
            i=ans;
            System.out.println(i+" "+ans);
            ans=arr[ans];
            move++;
        }
            if(check)
                System.out.println(move);
    }
}
