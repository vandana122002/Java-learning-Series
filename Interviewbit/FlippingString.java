package Interviewbit;

public class FlippingString {

    public static int solve(String A) {
        int count=0,pc=0;
        int spos=0,epos=0,fspos=0,fepos=0;
        boolean check=true;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)=='0'&&check)
            {
                count++;
                spos=i;
                epos=i;
                check=false;
            }else if(A.charAt(i)=='0')
            {
                count++;
                epos++;
            } else
            {
                    if(pc<count)
                    {
                        pc=count;
                        check=true;
                        fspos=spos;
                        fepos=epos;
                        epos=0;
                        spos=0;
                    }
                    count=0;
            }
        }

                    String beforefs=A.substring(0,fspos);
                    String afterfe=A.substring(fepos+1);

                    String one="";

                    for(int i=fspos;i<=fepos;i++)
                    {
                    one+="1";
                    }

                    String newA=beforefs+one+afterfe;
                    pc=0;
                    count=0;

                    for(int i=0;i<newA.length();i++)
                    {
                        if(newA.charAt(i)=='1')
                        {
                            count++;
                        }else
                        {
                            if(pc<count)
                            {
                                pc=count;
                            }
                            count=0;
                        }
                    }

        return pc;
        }
    public static void main(String[] args)
    {
        System.out.println(solve("11001000001111111010100100100110101011101101101010"));
    }
}
