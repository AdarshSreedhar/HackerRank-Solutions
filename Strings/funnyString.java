import java.io.*;
import java.util.*;
import java.math.*;
public class funnyString {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            {
                String s=in.next();
                StringBuffer r=new StringBuffer(s);
                r.reverse();
                boolean flag=true;
                for(int j=1;j<s.length();j++)
                    {
                        int test1=(int)s.charAt(j);
                        int test2=(int)s.charAt(j-1);
                        int diff1=Math.abs(test1-test2);
                        int test3=(int)r.charAt(j);
                        int test4=(int)r.charAt(j-1);
                        int diff2=Math.abs(test3-test4);
                        if(diff1==diff2)continue;
                    else {flag=false;break;}
                    }
            if(flag==true)System.out.println("Funny");
            else System.out.println("Not Funny");
            }
    }
}