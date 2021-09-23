package Practice;

public class Pratyush {
    public static void main(String[] args)
    {
        int[] arr={4,10,20,17,16,5};
        int[] prefix=new int[arr.length];
        int n=4;
        int[] q1={2,6};
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }


            for(int j=0;j<arr.length;j++)
            {
                for(int i=3;i<=max;i+=2) {
                    if(arr[j]%2==0)
                    {
                        arr[j]=2;
                    }else
                    {
                        if(arr[j]%i==0)
                        {
                            arr[j]=i;
                            break;
                        }
                    }
                }
                if(j==0)
                {
                    prefix[0]=arr[0];
                }else
                {
                    prefix[j]=prefix[j-1]+arr[j];
                }
            }

            for(int i=0;i< q1.length;i+=2)
            {
                if(q1[i]==1)
                {
                    System.out.println();
                }
            }


    }
}
