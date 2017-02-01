import java.io.*;
import java.util.*;

public class Pangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        s=s.replaceAll("\\s+","");
        s=s.toLowerCase();
        boolean flag=false;
        char[] alpha={'e','a','b','c','d','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0;i<alpha.length;i++)
            {
            if(s.indexOf(alpha[i])==-1){flag=true;break;}
            }
        if(flag==true)System.out.println("not pangram");
        else System.out.println("pangram");
    }
}