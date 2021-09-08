package Pattern;

public class ZPattern {
    public static void main(String[] args)
    {
        int count=3;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(i==0||i==4)
                {
                    System.out.print("*"+" ");
                }else
                {
                    if(j==count)
                    {
                        System.out.print("*"+" ");
                    }else
                    {
                        System.out.print("  ");
                    }

                }
            }
            if(i!=0&&i!=4){
                count--;}
            System.out.println();
        }
    }
}
