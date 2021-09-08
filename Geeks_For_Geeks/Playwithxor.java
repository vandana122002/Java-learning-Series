package Geeks_For_Geeks;

public class Playwithxor {
    public static void main(String[] args)
    {
        int[] arr={10, 11, 1, 2, 3};
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(10^11);
            System.out.println(arr[i]+" "+arr[i+1]+" "+(arr[i]^arr[i+1]));
            ans[i]=arr[i]^arr[i+1];
        }
        ans[ans.length-1]=ans[ans.length-2];
        for(int i:ans)
        {
            System.out.println(i);
        }
    }
}
