package Practice;

import java.io.*;
import java.util.*;

public class ordering_class{
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan=new Scanner(System.in);
            int num=scan.nextInt();
            int[] firstOne=new int[3];
            int[] secondOne=new int[3];
            int[] thirdOne=new int[3];
            while(num>0)
            {
                for(int i=0;i<firstOne.length;i++)
                {
                    firstOne[i]=scan.nextInt();
                }
                for(int i=0;i<secondOne.length;i++)
                {
                    secondOne[i]=scan.nextInt();
                }
                for(int i=0;i<thirdOne.length;i++)
                {
                    thirdOne[i]=scan.nextInt();
                }
                int count=0,count1=0,count2=0;
                for(int i=0;i<3;i++)
                {
                    if(firstOne[i]>secondOne[i])
                    {
                        count++;
                    }
                    if(firstOne[i]>thirdOne[i])
                    {
                        count++;
                    }
                    if(firstOne[i]<secondOne[i])
                    {
                        count1++;
                    }
                    if(secondOne[i]>thirdOne[i])
                    {
                        count1++;
                    }
                    if(thirdOne[i]>secondOne[i])
                    {
                        count2++;
                    }
                    if(firstOne[i]<thirdOne[i])
                    {
                        count2++;
                    }
                }
                if(count>count1&&count>count2)
                {
                    System.out.println("yes");
                }else if(count1>count&&count1>count2)
                {
                    System.out.println("yes");
                }else if(count2>count&&count2>count1)
                {
                    System.out.println("yes");
                }else
                {
                    System.out.println("no");
                }
                num--;
            }
        } catch (Exception e) {
            return;
        }
    }

}

