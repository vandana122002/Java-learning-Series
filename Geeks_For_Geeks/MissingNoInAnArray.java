package Geeks_For_Geeks;

public class MissingNoInAnArray {

    static int MissingNumber(int array[], int n) {
        // Your Code Here
        int[] arr=new int[n];
        arr[0]=-1;
        // for(int i:array)
        // {
        //     System.out.println(i);
        // }
        for(int i=0;i<n-1;i++)
        {
            if(array[i]<n)
            {
                arr[array[i]]++;
            }
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]==0)
            {
                return i;
            }
        }

        return n;
    }

    public static void main(String[] args)
    {
        int n=10;
        int[] array={1,2,3,4,5,6,7,8,10};
        System.out.println(MissingNumber(array,n));
    }
}
