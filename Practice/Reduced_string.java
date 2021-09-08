package Practice;

import java.util.*;
public class Reduced_string {
    public static void Super(ArrayList<Character> characters)
    {
        for(int i=0;i<characters.size()-1;i++) {
            if (characters.get(i) == characters.get(i + 1)) {
                characters.remove(i);
                characters.remove(i);
            }
        }
    }
    public static void main(String[] args)
    {
        String s="acdqglrfkqyuqfjkxyqvnrtysfrzrmzlygfveulqfpdbhlqdqrrqdqlhbdpfqluevfgylzmrzrfsytrnvqyxkjfquyqkfrlacdqj";
        String ans="";
        ArrayList<Character> characters=new ArrayList<>();
        char[] cha=s.toCharArray();
        for(char i:cha)
        {
            characters.add(i);
        }
        Super(characters);
        for(int i=0;i<characters.size()-1;i++) {
            while (characters.size() != 0 && characters.get(i) == characters.get(i+1)) {
                Super(characters);
            }
        }
            if(characters.isEmpty())
            {
                ans="Empty String";
            }
            else {
                for (Character chara : characters) {
                    ans = ans + chara;
                }
            }
        System.out.println("ans is "+ans);
    }
}
