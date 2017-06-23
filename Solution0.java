import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//https://www.hackerrank.com/contests/101hack50/challenges/hard-questions
public class Solution0 {

    static int maxScoreOfVincent(int n, String s, String t) 
    {
        int count =0;
        char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(c1[i]>='A'&&c1[i]<='E'&&c1[i]!=c2[i])
            {
                count++;

            }
        }
        return count;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  Return the maximum score of Vincent.
        int n = in.nextInt();
        String s = in.next();
        String t = in.next();
        if(n>=1&&n<=100){
        int result = maxScoreOfVincent(n, s, t);
        System.out.println(result);}
    }
}
