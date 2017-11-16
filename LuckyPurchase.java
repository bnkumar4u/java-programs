import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LuckyPurchase {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String s1="";
        int n1=Integer.MAX_VALUE;
        for(int a0 = 0; a0 < t; a0++)
        {
            String s = in.next();
            int n = in.nextInt();
            if(equal7and4(n)&&n<n1)
            {
            	s1=s;
            	n1=n;
            }

        }
        if(n1==Integer.MAX_VALUE)
        	System.out.println("-1");
        else System.out.println(s1);
        
        in.close();

    }
    private static boolean equal7and4(int n)
    {
    	int count=0,r;
    	while(n!=0)
    	{
    		r=n%10;
    		if(r==7)
    			count++;
    		else if(r==4)
    			count--;
       		else return false;
       		n=n/10;

    	}
    	if(count==0)
    		return true;
    	else return false;
    }
}
