import java.io.*;
import java.util.*;
import java.lang.*;
public class makingAnagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        
        int n1=s1.length();
        int n2=s2.length();
            
        List<Character> list1=new ArrayList<>();
        List<Integer> count1=new ArrayList<>();
        
        List<Character> list2=new ArrayList<>();
        List<Integer> count2=new ArrayList<>();
        
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
         
       for(int i=0;i<n2;i++)
            {
                char curr=s2.charAt(i);
                if(list2.contains(curr))
                    {
                        int index=list2.indexOf(curr);
                        int prevval=count2.get(index);
                        count2.set(index,prevval+1);
                    }
                else
                    {
                        list2.add(curr);
                        count2.add(1);
                    }
           }
        int count=0;
        for(int index=0;index<list1.size();index++)
            {
                char currchar=list1.get(index);
                int currfreq=count1.get(index);
                if(list2.contains(currchar))
                    {
                        int otherlistfreq=count2.get(list2.indexOf(currchar));
                        if(currfreq==otherlistfreq);
                        else count=count+Math.abs(currfreq-otherlistfreq);
                    }
                else 
                    {
                        count=count+currfreq;
                    }
            }
        
        for(int index=0;index<list2.size();index++)
            {
                char currchar=list2.get(index);
                int currfreq=count2.get(index);
                if(list1.contains(currchar));
                 else count=count+currfreq;
            }
        System.out.println(count);
    }
   
 }
