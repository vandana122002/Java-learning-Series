package Practice;

import java.util.*;

public class Leaderboard {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of reader player");
        int noreader=scan.nextInt();
        int[] readerarray=new int[noreader];
        System.out.println("Enter the scores of reader");
        for(int i=0;i<noreader;i++)
        {
            readerarray[i]= scan.nextInt();
        }
        System.out.println("Enter the no of player");
        int noplayer=scan.nextInt();
        int[] playerarray=new int[noplayer];
        System.out.println("Enter the scores of player");
        for(int i=0;i<noplayer;i++)
        {
            playerarray[i]= scan.nextInt();
        }
        int rank=1;
        ArrayList<Integer> allrank=new ArrayList<>();
        for(int i=0;i<playerarray.length;i++)
        {
            for(int j=0;j<readerarray.length;j++)
            {
                if(j!=readerarray.length-1&&readerarray[j]==readerarray[j+1])
                {
                    continue;
                }
                if(playerarray[i]<readerarray[j])
                {
                    rank++;
                }else
                {
                    break;
                }
            }
            allrank.add(rank);
            rank=1;
        }
        int count=0;
        for(int i=0;i<allrank.size();i++)
        {
            System.out.println("Rank of player is "+allrank.get(i));
            if(allrank.get(i)==1)
            {
                count++;
            }
        }
        System.out.println("No of 1 is "+count);
    }
}
