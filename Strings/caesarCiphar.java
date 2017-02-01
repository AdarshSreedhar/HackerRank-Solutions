import java.io.*;
import java.util.*;

public class caesarCiphar {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String s=in.next();
        int k=in.nextInt();
        
        String t="";
        for(int i=0;i<n;i++)
            {
                char curr=s.charAt(i);
                int asciiofcurr=(int)curr;
                if(asciiofcurr<91&&asciiofcurr>64)
                    {
                        curr=(char)(65+((asciiofcurr-65)+k)%26);
                    }
                else if(asciiofcurr<123&&asciiofcurr>96)
                    {
                        curr=(char)(97+((asciiofcurr-97)+k)%26);
                    }
            t=t+curr;
        }
        System.out.println(t);
    }
}