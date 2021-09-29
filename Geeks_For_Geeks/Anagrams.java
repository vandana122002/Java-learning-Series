package Geeks_For_Geeks;

import Pepcoding.Infix;

import java.util.ArrayList;
import java.util.HashMap;

public class Anagrams {

    public static int count(String txt,String path)
    {
        int count=0;
        int[] arr=new int[26];
        int i=0,j=path.length();
        HashMap<Character, Integer> h=new HashMap<>();
        HashMap<Character,Integer> ans=new HashMap<>();

        for(int a=0;a<path.length();a++)
        {
            if(h.getOrDefault(path.charAt(a),0)==0)
            {
                h.put(path.charAt(a),1);
            }else
            {
                h.put(path.charAt(a),h.get(path.charAt(a))+1);
            }
        }


        while(j<txt.length())
        {

        }
        return count;
    }
    public static void main(String[] args)
    {
        String txt="forxxorfxdofr";
        String path="for";
        System.out.println(count(txt,path));
    }
}
