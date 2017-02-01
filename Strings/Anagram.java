import java.io.*;
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=0;i<num;i++)
            {
                String s=in.next();
                int n=s.length();
                if(n%2==0)
                    {
                        List<Character> s1=new ArrayList<>();
                        for(int j=0;j<n/2;j++)s1.add(s.charAt(j));
                        List<Character> s2=new ArrayList<>();
                        for(int j=n/2;j<n;j++)s2.add(s.charAt(j));
                        int noc=0;
                        for(char c:s1)
                            {
                                int ind=s2.indexOf(c);
                                if(ind>=0)
                                    s2.set(ind,'A');
                            }
                    System.out.println(s2.size()-Collections.frequency(s2,'A'));
                }
            else System.out.println("-1");
            }
    }
}