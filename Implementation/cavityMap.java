import java.io.*;
import java.util.*;
import java.lang.*;

public class cavityMap {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
    String[] B=new String[n];
        
       for(int i=0;i<n;i++)
          B[i]=in.next();
        
        int[][] A=new int[n][n];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                A[i][j]=Character.getNumericValue(B[i].charAt(j));
        for(int i=1;i<n-1;i++)
            for(int j=1;j<n-1;j++)
                {
                    if(A[i-1][j]>=A[i][j])continue;
                    else if(A[i+1][j]>=A[i][j])continue;
                    else if(A[i][j-1]>=A[i][j])continue;
                     else if(A[i][j+1]>=A[i][j])continue;
                      else A[i][j]=101;
                }
            
        
        for(int i=0;i<n;i++)
            {
                        for(int j=0;j<n;j++)
                    {
                            if(A[i][j]==101)
                                System.out.print("X");
                            else 
                                System.out.print(A[i][j]);
                    }
                    System.out.print("\n");
            }
        
        
        
    }
}