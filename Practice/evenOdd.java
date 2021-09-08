package Practice;

import java.io.*;
import java.util.*;

public class evenOdd{
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan=new Scanner(System.in);
            long lastNum=scan.nextInt();
            long pos=scan.nextInt();
            //Your Solve
            long even=0,count=0;
            long countEven=0;
            if(lastNum%2==0)
            {
                even=1;
                countEven=lastNum/2;
            }else
            {
                countEven=(lastNum/2)+1;
            }
            if(even==1)
            {
                if(pos<=lastNum/2)
                {
                    for(int i=1;i<=lastNum;i++)
                    {
                        if(i%2!=0)
                        {
                            count++;
                        }
                        if(count==pos)
                        {
                            System.out.println(i);
                            break;
                        }
                    }
                }else{
                    for(int i=1;i<=lastNum;i++)
                    {
                        if(i%2==0)
                        {
                            countEven++;
                        }
                        if(countEven==pos)
                        {
                            System.out.println(i);
                            break;
                        }
                    }
                }

            }else
            {
                if(pos<=(lastNum/2)+1)
                {
                    for(int i=1;i<=lastNum;i++)
                    {
                        if(i%2!=0)
                        {
                            count++;
                        }
                        if(count==pos)
                        {
                            System.out.println(i);
                            break;
                        }
                    }
                }else{
                    for(int i=1;i<=lastNum;i++)
                    {
                        if(i%2==0)
                        {
                            countEven++;
                        }
                        if(countEven==pos)
                        {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }

        } catch (Exception e) {
            return;
        }
    }

}

