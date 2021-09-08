package CodeChef;
//import java.util.*;
//public class Caravas {
//    public  static void Practice.main(String[] args)
//    {
//        Scanner scan=new Scanner(System.in);
//        int n=scan.nextInt();
//        while(n-->0)
//        {
//            int N=scan.nextInt();
//            long[] arr=new long[N];
//            for(int i=0;i<N;i++)
//            {
//                arr[i]=scan.nextLong();
//            }
//            int[] ans=new int[N];
//            Arrays.fill(ans,0);
//            ans[0]=1;
//            for(int i=N-1;i>=1;i--)
//            {
//                if(arr[i-1]>arr[i])
//                {
//                    ans[i]=1;
//                }
//            }
//            int count=0;
//            for(int i:ans)
//            {
//                if(i==1)
//                {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Caravas {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader s = new FastReader();
        int n = s.nextInt();
        int k = s.nextInt();
        int count = 0;
        while (n-- > 0) {
            int x = s.nextInt();
            if (x % k == 0)
                count++;
        }
        System.out.println(count);
    }
}
