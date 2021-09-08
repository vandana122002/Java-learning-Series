package Interviewbit;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class matrix_zero{
    static public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        ArrayList<Integer> index = new ArrayList<>();
        boolean[] column = new boolean[a.get(0).size()];
        boolean[] row = new boolean[a.size()];
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.get(0).size(); j++) {
                if (a.get(i).get(j) == 0) {
                    index.add(i);
                    index.add(j);
                }
            }
        }
        System.out.println(index.size());
//        int count = 0;
//        for (int i = 0; i < index.size(); i = i + 2) {
//            for (int j = 0; j < a.get(0).size(); j++) {
//                if (row[index.get(i)] == false)
//                    count++;
        // a.get(index.get(i)).set(j,0);}
//            }

//            row[index.get(i)] = true;

        // for(int j=0;j<a.size();j++)
        // {
        //     if(column[index.get(i)]==false)
        //     a.get(j).set(index.get(i),0);
        // }
        // column[index.get(i)]=true;
//    }
    }
        public static void main(String[] args)
        {
            ArrayList<ArrayList<Integer>> a=new ArrayList<>();
            ArrayList<Integer> a1=new ArrayList<>();
            a1.add(1);
            a1.add(0);
            a1.add(1);
            a.add(a1);
            ArrayList<Integer> a2=new ArrayList<>();
            a2.add(1);
            a2.add(1);
            a2.add(1);
            a.add(a2);
            ArrayList<Integer> a3=new ArrayList<>();
            a3.add(1);
            a3.add(0);
            a3.add(1);
            a.add(a3);
            setZeroes(a);
        }

}
