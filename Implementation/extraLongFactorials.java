import java.io.*;
import java.util.*;
import java.math.*;
public class extraLongFactorials {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BigInteger counter=in.nextBigInteger();
        //System.out.println(counter);
        
        BigInteger unit=new BigInteger("1");
        BigInteger prod=new BigInteger("1");
        
        while(counter.compareTo(unit)==1)
           {
           prod=prod.multiply(counter);
           counter=counter.subtract(unit);
           
       }
        System.out.println(prod);
      }
}