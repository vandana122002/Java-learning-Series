package Geeks_For_Geeks;

public class NCandies {
    public static void main(String[] args)
    {
        int N=10,K=3;
       Long ans[]=new Long[K];
       int candies=1;

       for(int i=0;i<K;i++)
       {
           ans[i]=0l;
       }
       int idx=0;
        while(N>candies)
        {
            ans[idx]=ans[idx]+(candies);
            idx++;
            if(idx>=K)
            {
                idx=0;
            }
            N=N-candies;
            candies++;
        }
        ans[idx]=ans[idx]+N;
        for(Long i:ans)
        {
            System.out.print(i+" ");
        }
    }
}
