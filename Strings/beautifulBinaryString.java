import java.io.*;
import java.util.*;

public class beautifulBinaryString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        
        int n=in.nextInt();
        String s=in.next();
       int index=0;
        int count=0;
        boolean flag=true;
        while(index<n)        
            {
                index=s.indexOf("010",index);
                //System.out.println()
                if(index==-1){break;}
                else {count++;index=index+3;}
            }
        if(flag==false)System.out.println("0");
        else System.out.println(count);
    }
}