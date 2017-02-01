import java.io.*;
import java.util.*;
//import java.lang.*;
public class theTimeInWords {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner in=new Scanner(System.in);
        int hour=in.nextInt();
        String[] number={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine","thirty"};
        int min=in.nextInt();
        
        if(min<=30)
            {
            String h=number[hour-1];
                if(min==0)
                    System.out.println(h+" o' clock");
                else
                    {
                        String m=number[min-1];
                
                         if(min==1)
                            System.out.println("one minute past "+h);
                        else if(min==15)
                            System.out.println("quarter past "+h);
                        else if(min==30)
                            System.out.println("half past "+h);
                        else
                            System.out.println(m+" minutes past "+h);    
                    }
        }
        else
            {
                String h=number[hour];
                String m=number[59-min];
                if(min==45)
                    System.out.println("quarter to "+h);
                else if(min==59)
                    System.out.println("one minute to "+h);
                else
                    System.out.println(m+" minutes to "+h);
            }
    }
}