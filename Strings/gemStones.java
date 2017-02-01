import java.io.*;
import java.util.*;

public class gemStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
                String s=in.next();
                List<Character> std = new ArrayList<>();
                for(int j=0;j<s.length();j++)std.add(s.charAt(j));
                Set<Character> hs = new HashSet<>();
                hs.addAll(std);
                std.clear();
                std.addAll(hs);
                int count=std.size();
        
        for(int i=0;i<n-1;i++)
            {
                String s1=in.next();
                List<Character> al = new ArrayList<>();
                for(int j=0;j<s1.length();j++)al.add(s1.charAt(j));
                Set<Character> hs1 = new HashSet<>();
                hs1.addAll(al);
                al.clear();
                al.addAll(hs1);
            
                al.retainAll(std);
            
                if(al.size()<count)count=al.size();
            
                std = new ArrayList<Character>(al);

            }
      
        System.out.println(count);
    }
}