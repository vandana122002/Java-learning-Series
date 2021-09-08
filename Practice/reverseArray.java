package Practice;

public class reverseArray {
    public static void main(String[] args)
    {
        int[] array={1,2,3};
        int[] queries={0,1,2};
        int k=2;
        int[] answer=new int[queries.length];
        for(int j=0;j<k;j++)
        {
            for(int i=array.length-1;i>0;i--)
            {
                int temp=array[i];
                array[i]=array[i-1];
                array[i-1]=temp;
            }
        }
        for(int i=0;i<3;i++)
        {
            System.out.print(array[i]+" ");
        }
        for(int i=0;i<queries.length;i++)
        {
            answer[i]=array[queries[i]];
        }
        System.out.println();
        for(int i=0;i<answer.length;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
}
