import java.io.*;
import java.util.*;

public class alternatingCharacters {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            {
                String s=in.next();
                int index=1;
            char curr=s.charAt(0);
               int count=0;
                while(index<s.length())
                    {
                        if(curr=='A')
                            {
                            if(s.charAt(index)=='A'){count++;curr='A';}
                                else curr='B';
                                
                            }
                        
                        else
                            {
                                 if(s.charAt(index)=='B'){count++;curr='B';}
                                else curr='A';
                               
                            }
                        index++;
                    }
            System.out.println(count);
            }
    }
}