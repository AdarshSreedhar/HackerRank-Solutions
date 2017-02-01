import java.io.*;
import java.util.*;

public class gameOfThrones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int n=s.length();
        List<Character> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        for(int i=0;i<n;i++)
            {
                char curr=s.charAt(i);
            
                if(arr1.contains(curr))
                    {
                        int index=arr1.indexOf(curr);
                        int prevval=arr2.get(index);
                        arr2.set(index,prevval+1);
                    }
                else
                    {
                        arr1.add(curr);
                        arr2.add(1);
                    }
           
            }
         int numofodd=0;
                int numofeve=0;
                for (Integer o: arr2) 
                {
                    if(o%2==0)numofeve++;
                    else numofodd++;
                }
        if(n%2==0)//string is even length
            {
                if(numofeve==arr1.size())//countofallelements areeven
                    System.out.println("YES");
            else 
                System.out.println("NO");
        }
        else
            {
                if(numofodd==1)//only one element has count odd
                System.out.println("YES");
                 else //more than one element has count odd
                System.out.println("NO");
        }
    }
}