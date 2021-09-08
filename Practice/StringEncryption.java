package Practice;
//
//
//public class StringEncryption {
//    static String swap(int a,int b,String s)
//    {
//        StringBuilder z=new StringBuilder(s);
//        String c=s.substring(a,a+1);
//        String d=s.substring(b,b+1);
//        z.replace(a,a+1,d);
//        z.replace(b,b+1,c);
//        return z.toString();
//
//    }
//    static public String solve(String A, int B, int[][] C) {
//        String ans="";
//        for(int a=0;a<B;a++)
//        {
//            int j=C[a][0];
//            int b=C[a][2];
//            for(int i=0;i<C[a][3];i++)
//            {
//                int k=j;
//                j=(C[a][1]*j+b)%A.length();
//                b=k;
//                System.out.println(j+" "+b);
//            }
//            A=swap(C[a][0],j,A);
//            System.out.println(A);
//
//        }
//        return A;
//    }
//
//    public static void main(String[] args)
//    {
//        String s="sptraan";
//        int B=2;
//        int[][] c={{2,2,3,2},{4,1,2,3}};
//        System.out.println(solve(s,B,c));
//    }
//}

