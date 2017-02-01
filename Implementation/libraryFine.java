import java.io.*;
import java.util.*;

public class libraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int acd=in.nextInt();
        int acm=in.nextInt();
        int acy=in.nextInt();
        int kd=in.nextInt();
        int km=in.nextInt();
        int ky=in.nextInt();
        int fine=0;
        if(acy>ky)fine=10000;
        else if(acy<ky);
            else
            {
                if(acm>km)fine=500*(acm-km);
                else if(acm<km);
                else
                    {
                        if(acd>kd)fine=15*(acd-kd);
                    }
            }
        System.out.println(fine);
    }
}