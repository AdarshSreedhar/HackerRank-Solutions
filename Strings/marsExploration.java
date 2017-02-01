import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class marsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
       int num=s.length()/3;
        int count=0;
        for(int i=0;i<num;i++)
            {
                int index=3*i;
                if(s.charAt(index)=='S');
                else count++;
                if(s.charAt(index+1)=='O');
                else count++;
                if(s.charAt(index+2)=='S');
                else count++;
            }
        System.out.println(count);
    }
}
