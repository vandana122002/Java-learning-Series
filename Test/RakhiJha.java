package Test;

import java.io.*;

public class RakhiJha {

    //1 Question Rotate Array
    static void q1(String[] val,int k)
    {
        k=k%val.length;
        int[] arr=new int[val.length];
        int count=val.length-k;
        for(int i=0;i<k;i++)
        {
            arr[i]=Integer.valueOf(val[count]);
            count++;
        }
        count=k;
        for(int i=0;i<val.length-k;i++)
        {
            arr[count]=Integer.valueOf(val[i]);
            count++;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }

    //2que Diagonal traversal
    static void q2(String arr[][],int m,int n)
    {
        for(int g=m;g>=0;g--)
        {
            for(int i=g,j=0;i<m;i++,j++)
            {
                System.out.println(arr[i][j]);
            }
        }

        for(int g=1;g<n;g++)
        {
            for(int i=0,j=g;j<n;i++,j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }

    //3que Pattern
    static void q3(int n)
    {
        for(int i=0;i<n;i+=2)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j+i*n+" ");
            }
            System.out.println();
        }
        int count=n;
        if(n%2==0)
        {n=n-1;} else
        {
            n=n-2;
        }
        for(int i=n;i>0;i-=2)
        {
            for(int j=1;j<=count;j++)
            {
                System.out.print(j+i*count+" ");
            }
            System.out.println();
        }
    }

    //4que Power
    static double q4(double base,int pow)
    {
        if(pow==0)
        {
            return 1;
        }else if(pow%2==0)
        {
            return q4(base*base,pow/2);
        }else
        {
            return q4(base*base,(pow-1)/2)*base;
        }
    }

    //5que String Toggling
    static void q5(String s)
    {
        if(s.length()==0)
        {
            return ;
        }else if(s.charAt(0)>=65&&s.charAt(0)<=91)
        {
            System.out.print((char)((int)s.charAt(0)+32));
            q5(s.substring(1));
        }else
        {
            System.out.print((char)((int)s.charAt(0)-32));
            q5(s.substring(1));
        }
    }


    //6 que Fibonacci
    static void q6(int n)
    {
        int a=0,c=1,d=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+" ");
                d=a+c;
                a=c;
                c=d;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value as per question no");
        int k=Integer.valueOf(b.readLine());
        switch (k)
        {
            case 1:
                //1 que
                System.out.println("Enter the elements of array ");
                String[] val=b.readLine().trim().split(" ");
                System.out.println("Enter the rotation value ");
                int a=Integer.valueOf(b.readLine());
                q1(val,a);
                break;
            case 2:
                //2 que
                System.out.println("Enter the row ");
                int m=Integer.valueOf(b.readLine());
                System.out.println("Enter the column ");
                int n=Integer.valueOf(b.readLine());
                System.out.println("Enter the elements of the array ");
                String[][] arr=new String[m][n];
                for(int i=0;i<m;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                        arr[i][j]=b.readLine().trim();
                    }
                }
                q2(arr,m,n);
                break;
            case 3:
                //3 que
                System.out.println("Enter the row");
                int j=Integer.valueOf(b.readLine());
                q3(j);
                break;
            case 4:
                // 4 que
                System.out.println("Enter the no");
                double base=Double.valueOf(b.readLine());
                System.out.println("Enter the pow");
                int pow=Integer.valueOf(b.readLine());
                System.out.println(q4(base,pow));
                break;
            case 5:
                // 5 que
                System.out.println("Enter the string");
                String s=b.readLine();
                q5(s);
                break;
            case 6:
                // 6 que
                System.out.println("Enter the row ");
                int no=Integer.valueOf(b.readLine());
                q6(no);
                break;
        }
    }
}
