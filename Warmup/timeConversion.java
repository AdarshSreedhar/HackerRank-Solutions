import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        String s=in.next();
       
        int hour=Integer.parseInt(s.substring(0,2));
        String rem=s.substring(2,8);
        String tz=s.substring(8,10);
        if(tz.equals("PM"))
            {
            if(hour==12) System.out.println((hour)+rem);
            else System.out.println((hour+12)+rem);
        }
        else if(tz.equals("AM"))
                {
                    if(hour==12) System.out.println("00"+rem);
                    else if(hour<10)System.out.println("0"+hour+rem);
                        else System.out.println(hour+rem);
                }
      
    }
}