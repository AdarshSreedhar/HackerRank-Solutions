import java.io.*;
import java.util.*;

public class manasaAndStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int t=1;
        for(int i=0;i<n;i++)
            {
                int num=in.nextInt();
                int a=in.nextInt();
                int b=in.nextInt();
                int[] A=new int[2];
                A[0]=a;
                A[1]=b;
               Set<Integer> list1 = new HashSet<>();
               Set<Integer> list2 = new HashSet<>();
                list1.add(0);
            for(int j=1;j<num;j++)
                {
                    
                    if(j%2==1)
                        {
                            list2.clear();
                            for(Integer curr :list1)
                                {
                                    for(int u=0;u<2;u++)
                                        {
                                            list2.add(curr+A[u]);
                                        }
                                }
                        }
                    else
                        {
                            list1.clear();
                            for(Integer curr :list2)
                                {
                                    for(int u=0;u<2;u++)
                                        {
                                            list1.add(curr+A[u]);
                                        }
                                }
                        }
                }
            if(num%2==0)
                {
                    ArrayList<Integer> lis1=new ArrayList<>(list2);
                    Collections.sort(lis1);
                    for(Integer ele:lis1)System.out.print(ele+" ");
                    
                }
            else
                {
                    ArrayList<Integer> lit1=new ArrayList<>(list1);
                    Collections.sort(lit1);
                   for(Integer ele:lit1)System.out.print(ele+" ");
                }
            System.out.println();
        }
    }
}
               