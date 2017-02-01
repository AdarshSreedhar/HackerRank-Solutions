import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class strangeCounter {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        BigInteger tinput = in.nextBigInteger();
        BigInteger two=new BigInteger("2");
        BigInteger cumulative=new BigInteger("3");
        BigInteger gp=new BigInteger("3");
        BigInteger unit=new BigInteger("1");
        while(cumulative.compareTo(tinput)==-1)
            {
                gp=gp.multiply(two);
                //System.out.println(gp);
                cumulative=cumulative.add(gp);
            
            }
        //System.out.println(cumulative+" "+tinput);
    System.out.println((cumulative.subtract(tinput)).add(unit));
    }
}
