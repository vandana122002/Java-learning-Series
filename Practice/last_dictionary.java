package Practice;


import java.util.Arrays;
import java.util.Collections;

public class last_dictionary {
    public static void main(String[] args)
    {
        String[] arr=new String[2];
        arr[0]="aaaa";
        arr[1]="z";

        Arrays.sort(arr,Collections.reverseOrder());

        for(String i:arr)
        {
            System.out.println(i);
        }
        System.out.println();
    }
}
