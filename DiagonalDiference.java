import java.io.*;
import java.util.*;

/**
*absolute difference of sum of diagonal elements
**/
public class DiagonalDiference {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a1=0,b1=0,c;
        int n=s.nextInt();

        int[][] a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=s.nextInt();

        for(int i=0,j=n-i-1;i<n;i++,j--)
        { 
            a1=a1+a[i][i];
            b1=b1+a[i][j];        
        }

        
        if(a1>=b1)
            c=a1-b1;
        else 
            c=b1-a1;

        System.out.println(c);
            
}}