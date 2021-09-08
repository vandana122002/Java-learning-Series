package Geeks_For_Geeks;

public class PalidromicSubstring {
    public static void main(String[] args)
    {
        String s="ayaxzfbjbkrxiri";
        boolean[][] a=new boolean[s.length()][s.length()];
        int size=0,last=0,min=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            a[i][i]=true;
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1))
            {
                a[i][i+1]=true;
                    size=i;
                    last=i+1;
            }
        }

        for(int i=2;i<a.length;i++)
        {
            int k=i;
            for(int j=0;j<a.length-2&&k<s.length();j++)
            {
                if(s.charAt(j)==s.charAt(k)&&a[j+1][k-1])
                {
                    a[j][k]=true;
                        size = j;
                        last = k;
                }
                    k++;
            }
        }


        System.out.println(s.substring(size,last+1));
    }
}
