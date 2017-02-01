import java.io.*;
import java.util.*;
import java.*;
public class theLoveLetterMystery {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            {
                String s=in.next();
                int count=0;
                int leftptrind=0;
                        int rightptrind=s.length()-1;
                if(s.length()%2==1)
                    {                       
                        while(leftptrind!=rightptrind)
                            {
                                char leftcurr=s.charAt(leftptrind);
                                char rightcurr=s.charAt(rightptrind);
                                
                                if(leftcurr==rightcurr);
                                else
                                    count+=Math.abs((int)leftcurr-(int)rightcurr);
                                    
                                    leftptrind++;
                                    rightptrind--;
                            }
                    }
                else
                    {
                        while(leftptrind<(rightptrind))
                            {
                                char leftcurr=s.charAt(leftptrind);
                                char rightcurr=s.charAt(rightptrind);
                                
                                if(leftcurr==rightcurr);
                                else
                                    count+=Math.abs((int)leftcurr-(int)rightcurr);
                                    
                                    leftptrind++;
                                    rightptrind--;
                            }
                        }
            System.out.println(count);
            }
    }
}