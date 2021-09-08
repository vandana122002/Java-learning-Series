package Geeks_For_Geeks;

import java.util.ArrayList;

public class Subsetsum {
    static void sub(ArrayList<Integer> arr,ArrayList<Integer> a,int l,int r,int sum)
    {
        if (l > r) {
            a.add(sum);
            return;
        }

        // Subset including arr[l]
        sub(arr, a,l + 1, r, sum + arr.get(l));

        // Subset excluding arr[l]
        sub(arr, a,l + 1, r, sum);
    }
    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> a=new ArrayList<>();
        sub(arr,a,0,arr.size()-1,0);
        return a;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(5);
        ans.add(2);
        ans.add(1);
        ans=subsetSums(ans,ans.size());
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}
