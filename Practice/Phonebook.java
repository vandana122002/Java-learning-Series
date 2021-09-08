package Practice;

import java.util.*;
import java.io.*;

public class Phonebook{
    public static void main(String []argh) {
        HashMap<String, Integer> h = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            h.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (h.containsKey(s)) {
                System.out.println(h.get(s));
            } else {
                System.out.println("Not Found");
            }
        }
    }
}
