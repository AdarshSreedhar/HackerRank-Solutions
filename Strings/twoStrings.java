import java.io.*;
import java.util.*;
import java.lang.*;
public class twoStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            {
                char[] a=in.next().toCharArray();
                char[] alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
                char[] b=in.next().toCharArray();
                boolean flag=false;
                for(char c:alpha)
                {
                    if(contains(a,c)&&contains(b,c)){flag=true;break;}    
                }
            if(flag==true)System.out.println("YES");
            else System.out.println("NO");
            }
}
    public static boolean contains(char[] t,char c)
        {
            for(char curr:t)if(curr==c)return true;
                return false;
        }
}