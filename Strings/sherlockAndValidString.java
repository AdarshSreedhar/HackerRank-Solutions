import java.io.*;
import java.util.*;
import java.lang.*;
public class sherlockAndValidString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        int n1=s1.length();
        List<Character> list1=new ArrayList<>();
        List<Integer> count1=new ArrayList<>();
                
        for(int i=0;i<n1;i++)
            {
                char curr=s1.charAt(i);
                if(list1.contains(curr))
                    {
                        int index=list1.indexOf(curr);
                        int prevval=count1.get(index);
                        count1.set(index,prevval+1);
                    }
                else
                    {
                        list1.add(curr);
                        count1.add(1);
                    }
           }
        
       Set<Integer> C=new HashSet<>();
        C.addAll(count1);
        int num=C.size();
        
        if(num==1)
            System.out.println("YES");
        else if(num==2)
            {
                List<Integer> D=new ArrayList<>();
                D.addAll(C);
                //System.out.println(count1);
                //System.out.println(Collections.frequency(count1,D.get(0))+" "+num);
                int y=Collections.frequency(count1,D.get(0));
                if(y==1||y==count1.size()-1)
                    System.out.println("YES");   
                else 
                    System.out.println("NO");
            }
        else 
            System.out.println("NO");
        
        
    }
   
 }
