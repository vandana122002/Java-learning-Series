package Practice;

import java.io.*;
import java.util.*;

public class i_Love{
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan=new Scanner(System.in);
            int noOfContest=scan.nextInt();
            //Your Solve
            int[] allScores=new int[noOfContest];
            int amazing=0,smallest=1,largest=1;
            for(int i=0;i<noOfContest;i++)
            {
               allScores[i]=scan.nextInt();
            }
            for(int i=1;i<allScores.length;i++)
            {
                System.out.println("i is "+allScores[i]);
//                System.out.println(" i no is "+i);
                for(int j=i-1;j>=0;j--)
                {
                    System.out.println(" j no is "+j);
                    System.out.println("j is  "+allScores[j]);
//                   if(allScores[j]<allScores[i])
//                   {
//                       System.out.println("not small");
//                       smallest=0;
//                   }

                   if(allScores[j]>allScores[i])
                   {
                       System.out.println("not largest");
                       largest=0;
                   }
                }
//                System.out.println("largest is "+largest);
                if(largest==1)
                {
                    System.out.println(allScores[i]);
                    amazing++;
                }
            }
            System.out.println(amazing);
        } catch (Exception e) {
            return;
        }
    }

}

