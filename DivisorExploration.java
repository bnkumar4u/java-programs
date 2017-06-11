import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisorExploration {

    static int divisorExploration(int m, int a, int d)
    {
        int n=1;

        for(int i=1, p=2;i<=m;i++,p=nextPrime(p))
        {
            n=n*((int) Math.pow(p,a+i));
            
        }
    
        // Complete this function
    }
    static int nextPrime(int p)
    {
        int i=0;
        for(int p1=p+1;true;p1++)
        {
            for( i=2;i<p1;i++)
            {
                if(p1%i==0)
                    break;
            }
            if(i==p1)
                return p1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            int a = in.nextInt();
            int d = in.nextInt();
            int result = divisorExploration(m, a, d);
            System.out.println(result);
        }
    }
}
