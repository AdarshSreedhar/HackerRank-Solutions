import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
public class stringConstruction {

   public static void main(String[] args)
       {
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       for(int i=0;i<n;i++)
           {
                String s=in.next();
           Set<Character> l=new HashSet<>();
           for(int j=0;j<s.length();j++)
               {
                    l.add(s.charAt(j));
                }
           System.out.println(l.size());
        }
    }
}
