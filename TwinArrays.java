import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwinArrays {

    static int twinArrays(int[] ar1, int[] ar2,int n)
    {
        int min1=ar1[0],min2=ar1[0],min3=ar2[0],min4=ar2[0],pos1=0,pos2=0,t;
        min1=min2=min3=min4=t= 100001;
        for (int i=0;i<n ;i++ ) 
        {
            if(ar1[i]<min1 )
            {
                min2=min1;
                min1=ar1[i];
                pos1=i;
            }
            else if(ar1[i]<min2)
                min2=ar1[i];
        }

        for (int i=0;i<n ;i++ ) 
        {
            if(ar2[i]<min3 )
            {
                min4=min3;

                min3=ar2[i];
                pos2=i;
            }
            else if(ar2[i]<min4)
                min4=ar2[i];
        }
        if(pos1!=pos2)
            return (min1+min3);
        else
        {
            int min;
            if(min1+min4<min2+min3)
                min=min1+min4;
            else
                min=min2+min3;
            
            return min;
        }
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       if(n>=2&&n<=100000)
       {
            int[] ar1 = new int[n];

        for(int ar1_i = 0; ar1_i < n; ar1_i++)
        {
            ar1[ar1_i] = in.nextInt();
        }
        int[] ar2 = new int[n];

        for(int ar2_i = 0; ar2_i < n; ar2_i++)
        {
            ar2[ar2_i] = in.nextInt();
        }
        int result = twinArrays(ar1, ar2,n);
        System.out.println(result);
           
       }
    }
}
