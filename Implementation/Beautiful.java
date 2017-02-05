import java.lang.*;
import java.util.*;
class Beautiful
{
	public static void main(String[]args)
	{
	Scanner in=new Scanner(System.in);
	int u,l;
        double d;
	l=in.nextInt();
	u=in.nextInt();
	d=in.nextDouble();
	int count=0;
	for(int i=l;i<=u;i++)
	{
		String si=Integer.toString(i);
		String osi="";
        int len=si.length();
		for(int j=len-1;j>=0;j--)
			osi+=si.charAt(j);
		int r=Integer.parseInt(osi);
        double s=Math.abs(r-i)/d;
        //did you know that if d was made int then the division would return an int
        if((Math.ceil(s)-Math.floor(s))==0)count++;
	}
	System.out.println(count);	
	}

}