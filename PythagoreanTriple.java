import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PythagoreanTriple 
{
    public static void main(String[] args) 
    {


       Scanner in =new Scanner(System.in);
        
        long a = Long.parseUnsignedLong(in.nextLine());

        long b,c;
        double x;

        
        if(a>=5&&a<=1000000000)
        { if(a%3==0)
          {
            b=(a/3)*4;
            c=(a/3)*5;
            
          }
         if(a%4==0)
          {
            b=(a/4)*3;
            c=(a/4)*5;
            
          }
           else
           {
                for (b=1;true;b++)
        {
          // x=Math.sqrt(a*a+b*b);
          
           if(Math.sqrt(a*a+b*b) %1 ==0 )
           {
            c= (int)Math.sqrt(a*a+b*b);
            if(c<a+b)
            break;
           }
            

        }
               
           }
        System.out.println(a+" "+b+" "+c);

        }
        
    }
}
