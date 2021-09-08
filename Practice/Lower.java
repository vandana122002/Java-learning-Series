package Practice;

public class Lower {
    public static void main(String[] args)
    {
        String s="We promptly judged antique ivory buckles for the next prize";
        s=s.toLowerCase();
        boolean pan=true;
        int[] alphabet=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if((int)s.charAt(i)!=32) {
            alphabet[(int)s.charAt(i)-97]=1;
            }
        }
        for (int j : alphabet) {
            System.out.println(j);
            if (j == 0) {
                pan = false;
                System.out.println("not panagram");
                break;
            }
        }
        if(pan)
        {
            System.out.println("panagram");
        }
    }
}
