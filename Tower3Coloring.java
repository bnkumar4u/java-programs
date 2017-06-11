import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tower3Coloring {

    static int towerColoring(int n){
    	int result=3;
    	for(int i=1;i<=n;i++)
    	{
    		for(int j=1;j<n;j++)
    		{
    			result=(result*result)%1000000007;


    		}
    	}
    	return result;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = towerColoring(n);
        System.out.println(result);
    }
}
