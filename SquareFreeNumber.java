import java.util.Scanner;
import java.io.*;
public class SquareFreeNumber 
{
 public static void main(String[] args)throws IOException {
    Scanner scan = new Scanner(System.in);
    int n=scan.nextInt();
    //System.out.println(n+"  "+isSquareFree(n));

    int noOfFactors=0;
    for(int i=2;i<=n;i++)
    {
        if(n%i==0)
        {
            //i is factor of n
            if(isSquareFree(i))
                noOfFactors++;
        }
    }
    System.out.println(noOfFactors);
    

}
public static boolean isSquareFree(int n)
{
    for(int i=2;i<=n;i++)
    {
        if(n%i==0)
        {
            if(isPerfectSquare(i))
                return false;
        }
    }
    return true;
}
  static boolean isPerfectSquare(double x) 
    {
         
        // Find floating point value of
        // square root of x.
        double sr = Math.sqrt(x);
     
        // If square root is an integer
        return ((sr - Math.floor(sr)) == 0);
    }
}


