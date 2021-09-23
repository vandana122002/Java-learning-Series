package Geeks_For_Geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class height
{
    int height;
    int index;
    height(int h,int i)
    {
        height=h;
        index=i;
    }
}

public class Minimise_the_Height {


    public static void main(String[] args)
    {
        int arr[] = {3, 9, 12, 16, 20};
        int k=3;
        int[] visited =new int[arr.length];
        ArrayList<height> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-k>=0)
                a.add(new height(arr[i]-k,i));
            a.add(new height(arr[i]+k,i));
        }
        Collections.sort(a, Comparator.comparingInt(h -> h.height));

//        for(height i:a)
//        {
//            System.out.println("index "+i.index);
//            System.out.println("height "+i.height);
//        }

        int right=0,left=0,ele=0,ans=0;
        while(right<a.size())
        {
            while(ele<arr.length&&right<a.size())
            {
                if(visited[a.get(right).index]==0)
                    ele++;
                visited[a.get(right).index]++;
                right++;
            }
            ans=a.get(right-1).height-a.get(left).height;

            if(visited[a.get(left).index]==1)
                ele--;
            visited[a.get(left).index]--;
            left++;
//            System.out.println(a.get(left).index+" "+right);



            while(right<a.size()&&ele<arr.length)
            {
                if(visited[a.get(right).index]==0)
                    ele++;

                visited[a.get(right).index]++;
                right++;
            }
//            System.out.println(ele+" "+ans);
            if(ele==arr.length)
                ans=Math.min(ans,a.get(right).height-a.get(left).height);
            else
                break;
        }
        System.out.println(ans);

    }
}
