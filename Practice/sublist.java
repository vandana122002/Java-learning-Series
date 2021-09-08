package Practice;

import java.util.*;

public class sublist {
    static int sublistLength(int[] arr,int n)
    {
        int sum;
        ArrayList<Integer> no=new ArrayList<>();
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            sum=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>n)
                {
                    return 1;
                }else
                {
                    sum=sum+arr[j];
                    count++;
                    if(sum>n){
                        no.add(count);
                        break;
                    }
                }
            }
            count=1;
        }
        if(no.isEmpty())
        return -1;
        else{
            int shortest=no.get(0);
            for(int i=1;i<no.size();i++)
            {
                if(shortest>no.get(i))
                {
                    shortest=no.get(i);
                }
            }
            return shortest;
        }
    }
    public static void main(String[] args)
    {
        int[] arr={1,0,0,0,1};
        int k=2;
        int ans=sublistLength(arr,k);
        System.out.println(ans);
    }
}
