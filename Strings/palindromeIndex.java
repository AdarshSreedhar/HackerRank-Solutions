import java.io.*;
import java.util.*;

public class palindromeIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            {
                String s=in.next();
               int leftptr=0;
                int rightptr=s.length()-1;
            boolean flag=false;
            while(leftptr<rightptr)
                {
                    if(s.charAt(leftptr)==s.charAt(rightptr)){leftptr++;rightptr--;}
                    else
                        {
                            StringBuilder test=new StringBuilder(s);
                            test.deleteCharAt(leftptr);
                            //System.out.println("the test string is now "+test+"and leftptr is "+leftptr+" and reversed string is "+new StringBuilder(test).reverse().toString());
                            //check whether removal of first char makes it a palindrom
                            if(test.toString().equals(new StringBuilder(test).reverse().toString()))
                                System.out.println(leftptr);
                            //else print the index of the second char
                            else
                                System.out.println(rightptr);
                            flag=true;
                            break;
                        }
                }
            if(flag==false)System.out.println("-1");
               
            }
    }
   
}