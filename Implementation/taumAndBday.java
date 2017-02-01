import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class taumAndBday {

    public static void main(String[] args) 
    {
    Scanner in=new Scanner(System.in);
        int n=in.nextInt();
    
    for(int i=0;i<n;i++)
        {
        
        BigInteger totcostforwhites,totcostforblacks;
        BigInteger nob=in.nextBigInteger();
        BigInteger now=in.nextBigInteger();
        BigInteger cob=in.nextBigInteger();
        BigInteger cow=in.nextBigInteger();
        BigInteger cocc=in.nextBigInteger();
        
       if((cow.add(cocc)).compareTo(cob)==-1)
            totcostforblacks=(nob.multiply(cow)).add(nob.multiply(cocc));
       else 
            totcostforblacks=nob.multiply(cob);
        if((cob.add(cocc)).compareTo(cow)==-1)
            totcostforwhites=(now.multiply(cob)).add(now.multiply(cocc));
        else
            totcostforwhites=now.multiply(cow);
                                                     String str=(totcostforblacks.add(totcostforwhites)).toString();
        System.out.println(str);
                                                             
                                                     }}}





    

