import java.io.*;
import java.util.*;
import java.lang.Math;
public class viralAdvertising {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        int y=5;
        
        for(int i=1;i<=n;i++)
            {
            count+=Math.floor(y/2);
            y=(int)Math.floor(y/2)*3;
            }
        System.out.println(count);
    }
}