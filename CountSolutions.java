import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
* No. of solutions to (x*x + y*y)== (x*a+y*b)
**/

public class CountSolutions {

    static long countSolutions(int a, int b, int c, int d)
    {
        // Complete this function
        long count=0;
        long D;
        double x1,x2;
        if(d<c)
        {
            for(int y=1;y<=d;y++)
            {

                D=(a*a)-(4*(y*y-b*y));
                
                if(D>0&& Math.sqrt(D)%1==0)
                {
                    D=(int) Math.sqrt(D);
                    x1=(a+D)/2.0;
                    x2=(a-D)/2.0;
                    if(x1<=c &&x1>=1 && x1%1==0)
                        count++;

                    if(x2<=c && x2>=1 && x2%1==0)
                        count++;

                }
                else if(D==0)
                {
                    x1=a/2;
                    if(x1<=c && x1>=1 && x1%1 == 0)
                        count++;
                }

            }
        }
        else
        {
            for(int x=1;x<=c;x++)
            {

                D=(b*b)-(4*(x*x-a*x));
                
                if(D>0&& Math.sqrt(D)%1==0)
                {
                    D=(int) Math.sqrt(D);
                    x1=(b+D)/2.0;
                    x2=(b-D)/2.0;
                    if(x1<=d &&x1>=1 && x1%1==0)
                        count++;

                    if(x2<=d && x2>=1 && x2%1==0)
                        count++;

                }
                else if(D==0)
                {
                    x1=b/2;
                    if(x1<=d && x1>=1 && x1%1 == 0)
                        count++;
                }

            }

        }
        
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
    if(q>=1&&q<=10)
    {
        for(int a0 = 0; a0 < q; a0++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            if(a>=1&&a<=100000 && b>=1&&b<=100000 && c>=1&&c<=100000 &&d>=1&&d<=100000)
            {
                long result = countSolutions(a, b, c, d);
                System.out.println(result);
            }
        }
    }
    }
}
