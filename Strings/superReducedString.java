import java.io.*;
import java.util.*;
import java.lang.*;
public class superReducedString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        StringBuilder s=new StringBuilder(s1);
       
        int currindex=0;
                    int nextindex=1;
        while(s.length()>0)
            {
                    
             //System.out.println(s+" "+s.length());
            
                        if(s.charAt(currindex)==s.charAt(nextindex))
                        {
                            s.delete(currindex,nextindex+1);
                    currindex=0;
                    nextindex=1;
                        }
                    else
                        {
                            currindex++;
                            nextindex++;
                            if(nextindex==s.length())break;
                        }
            }
        if(s.length()==0)System.out.println("Empty String");
        else
        System.out.println(s);
    }
}