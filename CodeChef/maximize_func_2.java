package CodeChef;


import java.util.Arrays;
import java.util.Scanner;

public class maximize_func_2 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        while(n>0) {
            int len=scan.nextInt();
            int[] arr=new int[len];
            for (int i=0;i<len;i++)
            {
                arr[i]=scan.nextInt();
            }
               Arrays.sort(arr);
            System.out.println(Math.abs(arr[0]-arr[1])+Math.abs(arr[1]-arr[arr.length-1])+Math.abs(arr[arr.length-1]-arr[0]));
            n--;
        }
    }
}
