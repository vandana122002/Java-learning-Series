package Practice;

import java.util.regex.*;
public class Learningregex {
    public static void main(String[] args)
    {
        System.out.println(Pattern.matches("^[a-zA-z0-9]+[@]{1}+[a-zA-z0-9]+[.]{1}+[a-zA-z0-9]+$","a99cgmail.com"));
    }
}
