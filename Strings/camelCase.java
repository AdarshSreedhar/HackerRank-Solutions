import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;
public class camelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count=1;
        for(int i=0;i<s.length();i++)
            {
                if(Character.isUpperCase(s.charAt(i)))count++;
            }
        System.out.println(count);
    }
}
