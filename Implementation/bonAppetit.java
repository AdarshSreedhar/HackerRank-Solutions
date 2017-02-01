import java.io.*;
import java.util.*;
public class bonAppetit 
{
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=in.nextInt();
        int b=in.nextInt();
        int sumbefore=0;
        int splitcost=0;
        for(int i=0;i<n;i++)
            {
            if(i==k)continue;
            sumbefore+=A[i];
            }
        splitcost=sumbefore/2;
        if(splitcost==b)
            System.out.println("Bon Appetit");
        else
            {
            System.out.println(A[k]/2);
            }
    }
}