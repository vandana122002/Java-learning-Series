package Practice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Name{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> set = new HashSet<>();
        int count = 0, previousSize = set.size();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i]);
            set.add(pair_right[i]);
            if (set.size() == previousSize) {
                System.out.println(count);
                previousSize = set.size();
            } else {
                count += 1;
                previousSize = set.size();
                System.out.println(count);
            }

        }
    }

    }