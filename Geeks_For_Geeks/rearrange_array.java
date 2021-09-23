package Geeks_For_Geeks;

import java.util.Arrays;

public class rearrange_array {
    public static void main(String[] args)
    {
        int[]  array={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        Arrays.sort(array);

        int negative=1,positive=0;

        for(int i=0;i<array.length;i++)
        {
            if(array[i]>=0)
            {
                positive=i;
                break;
            }
        }
        int pp=positive;
        positive=positive+1;
        System.out.println(negative+" "+positive);
        while(negative<pp&&positive< array.length)
        {
            int temp=array[negative];
            array[negative]=array[positive];
            array[positive]=temp;
            negative=negative+2;
            positive=positive+2;
        }

        for(int i:array)
        {
            System.out.print(i+" ");
        }
    }
}

