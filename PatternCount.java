import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PatternCount {

    static int patternCount(String s)
    {
        char[] ch =s.toCharArray();

        int count=0,i,j;

        for( i=0 ; i<ch.length ; i++)
        {
            if(ch[i]=='1')
            {
                for(j=i+1;j<ch.length;j++)
                {
                    if((ch[j]>='a'&&ch[j] <='z')||ch[j]==' ' )
                        break;

                    else if(ch[j]=='1'&&j!=i+1)
                    {
                        count++;
                        break;
                    }

                }

            }
        }
        return count;


        // Complete this function
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++)
        {
            String s = in.next();

            int result = patternCount(s);

            System.out.println(result);
        }
    }
}
