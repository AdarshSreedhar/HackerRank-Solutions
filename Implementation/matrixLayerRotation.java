import java.io.*;
import java.util.*;

public class matrixLayerRotation
{
    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
     int m=in.nextInt();
        int n=in.nextInt();
    int num=in.nextInt();
        int[][] A=new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                A[i][j]=in.nextInt();

       List<Integer> B=new ArrayList<>();
        
	for(int i=0;i<(m<n?m:n)/2;i++)
	{
		int count=0;
		B.clear();
		for(int j=i;j<n-i;j++){B.add(A[0+i][j]);count++;}
		for(int j=1+i;j<m-1-i;j++){B.add(A[j][n-1-i]);count++;}
		for(int j=n-1-i;j>=0+i;j--){B.add(A[m-1-i][j]);count++;}
		for(int j=m-2-i;j>=1+i;j--){B.add(A[j][0+i]);count++;}
		Collections.rotate(B,count-(num%count));
		count=0;
		for(int j=i;j<n-i;j++){A[0+i][j]=B.get(count);count++;}
		for(int j=1+i;j<m-1-i;j++){A[j][n-1-i]=B.get(count);count++;}
		for(int j=n-1-i;j>=0+i;j--){A[m-1-i][j]=B.get(count);count++;}
		for(int j=m-2-i;j>=1+i;j--){A[j][0+i]=B.get(count);count++;}
	}
            for(int i=0;i<m;i++)
	{
            for(int j=0;j<n;j++)
                System.out.print(A[i][j]+" ");
		
		System.out.println();
	}
    }
}