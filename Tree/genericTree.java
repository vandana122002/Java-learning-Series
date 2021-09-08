package Tree;

import java.util.ArrayList;
import java.util.Collections;

public class genericTree {

    static boolean isValid(char[][] arr,int x,int y,int n,int m)
    {
        return x<n && y<m && arr[x][y]=='.';
    }

    static int sed(char[][] arr,int x,int y,int n,int m)
    {
        if(x==n||y==m)
        {
            return -1;
        }
        return shortestPath(arr,x,y,n,m);
    }
    static int shortestPath(char[][] arr,int x,int y,int n,int m)
    {
        if(x==n&&y==m)
        {
            return 0;
        }
        if(isValid(arr,x,y,n,m))
        {

            int left=shortestPath(arr,x,y-1,n,m);
            int right=shortestPath(arr,x,y+1,n,m);
            int up=shortestPath(arr,x-1,y,n,m);
            int down=shortestPath(arr,x+1,y,n,m);

            return Math.min(Math.min(left,right),Math.min(up,down));

        }

        return -1;
    }
    public static void main(String[] args)
    {
        char arr[][]=
                {{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}};
        int[] entrance={1,2};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr[0].length;i++)
        {
            System.out.println(0+" "+i);
            a.add(sed(arr,entrance[0],entrance[1],0,i));
            System.out.println(arr.length-1+" "+i);
            a.add(sed(arr,entrance[0],entrance[1],arr.length-1,i));
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(0+" "+i);
            System.out.println(arr.length-1+" "+i);
            a.add(sed(arr,entrance[0],entrance[1],i,0));
            a.add(sed(arr,entrance[0],entrance[1],arr[0].length-1,i));
        }
        System.out.println(Collections.min(a));
    }
}
