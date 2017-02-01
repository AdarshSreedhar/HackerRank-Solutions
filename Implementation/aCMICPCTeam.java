import java.io.*;
import java.util.*;

public class aCMICPCTeam {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        
        String[] A=new String[n];
        
        for(int i=0;i<n;i++)A[i]=in.next();
        int max=0;
        int same=0;
        int not=0;
        
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                {
                    not=find(A[i],A[j],m);
                    if(not==max)same++;
                    else if(not>max){same=1;max=not;}
                }
        System.out.print(max+"\n"+same);
    }
    
   static  int find(String a,String b,int m)
        {
        int count=0;
            for(int t=0;t<m;t++)
                {
                    if((Character.getNumericValue(a.charAt(t))+Character.getNumericValue(b.charAt(t)))>0)count++;
                }
        return count;
        }
}