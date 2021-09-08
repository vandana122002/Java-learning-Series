package Test;

import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the row ");
        int m=scan.nextInt();
        System.out.println("Enter the column ");
        int n=scan.nextInt();
        int[][] arr=new int[m][n];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        int count=1;
        for(int g=m-1;g>=0;g--)
        {
            for(int i=g,j=0;i<m&&j<n;i++,j++)
            {
                System.out.println(arr[i][j]);
            }
            g--;
            if(g>0) {
                for (int i = m - 1, j = count; j >= 0; i--, j--) {
                    System.out.println(arr[i][j]);
                }
            }
            count+=2;
        }
        count=n-2;
//        for(int g=1;g<n;g++)
//        {
//            for(int i=count,j=n-1;i>=0;i--,j--)
//            {
//                System.out.println(arr[i][j]);
//            }
////            System.out.println("hello");
//            g++;
//            if(g<n) {
//                for (int i = 0, j = g; j < n; i++, j++) {
////                    System.out.println("value is "+g+" "+i+" "+j);
//                    System.out.println(arr[i][j]);
//                }
//            }
//            count-=2;
//        }

    }
}
