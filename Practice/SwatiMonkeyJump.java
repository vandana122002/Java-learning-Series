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

        int move=1,i=0;
        while(i<arr.length)
        {
            int ans=maxValue(arr,i+1,arr[i]+i);
            if(ans==-1)
            {
                break;
            }
            i=ans;
            move++;
        }

           System.out.println(move);
    }
}
