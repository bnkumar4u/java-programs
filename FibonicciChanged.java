import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//similar to fibonicci series i.e
//tn+2=tn+(tn+1)^2
public class FibonicciChanged {
   public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first two nmbers of series");
        BigInteger t1=new BigInteger(sc.next());
        BigInteger t2=new BigInteger(sc.next());
        System.out.println("which term do u want ? (tn?)");
        int n=sc.nextInt();
        BigInteger tn=new BigInteger("0");
        for(int i=3;i<=n;i++)
        {
            tn=t1.add(t2.multiply(t2));
            t1=t2;
            t2=tn;
        }
       System.out.println("t"+n+"th term is "+tn);
}
}
