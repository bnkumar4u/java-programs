import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s= "";
        for (int i=1;in.hasNext() ;i++)
        {
            s= s+Integer.toString(i)+" ";
            s=s+ in.nextLine();
            s=s+"\n";
        }

        System.out.print(s);


    }


}
