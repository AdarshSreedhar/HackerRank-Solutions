import java.io.*;
import java.util.*;

public class Encryption {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String text=in.nextLine();
        text=text.replaceAll("\\s","");
        int len=text.length();
        int numofrows=(int)Math.floor(Math.sqrt(len));
        int numofcols=(int)Math.ceil(Math.sqrt(len));
        if(numofcols*numofrows<len)numofrows=numofcols;
        for(int i=len;i<numofcols*numofcols;i++)text+='.';
        int index=0;
        for(int i=0;i<numofcols;i++)
     {       for(int j=0;j<numofrows;j++)
            {
            char curr=text.charAt(i+j*numofcols);
            if(curr!='.')
                System.out.print(curr);
            }
        System.out.print(" ");
    }
    }
}