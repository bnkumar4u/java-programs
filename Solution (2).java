import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minimumChocolateMoves(int n, int[] a) 
    {
        int result=0,counter=0,eresult=0;
        for(int i=0;i<n;i=i+2)
        {
            //even
            if(a[i]==1)
            {
               a[i]++;
                result++;
               counter--; 
            }
            else
            {
                if(a[i]%2==1)
            {
                a[i]--;
                    result++;
                counter++;
                
            }
            if(a[i]%2==0)
            {
                if(a[i]!=2)
                {
                    counter=counter+a[i]-2;
                    a[i]=2;
                }
               /* while(a[i]!=2)
                {
                    a[i]=a[i]-2;

                    counter=counter+2;
                }*/
            }

            }
        }

        for(int j=1;j<n;j=j+2)
        {
            // odd case
            if(a[j]%2==0)
            {
                a[j]--;
                counter++;
                eresult++;
            }
            if(a[j]%2==1)
            {
                if(a[j]!=1)
                {
                    counter=counter+a[j]-1;
                    a[j]=1;
                }
                /*while(a[j]!=1)
                {
                    a[j]=a[j]-2;
                    counter=counter+2;
                }*/
            }
        }
        if(counter>=0)
        {
            if(result>=eresult)
                return result;
            else
                return eresult;
        }

        // if(counter>=0)
        // {
        //     if(result%2==0)
        //         return result/2;
        //     else
        //         return ((result/2)+1);
        // }
        else
            return -1;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the minimum number of chocolates that need to be moved, or -1 if it's impossible.
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] X = new int[n];
            for(int X_i = 0; X_i < n; X_i++){
                X[X_i] = in.nextInt();
            }
            int result = minimumChocolateMoves(n, X);
            System.out.println(result);
        }
    }
}
