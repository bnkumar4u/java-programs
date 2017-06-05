import java.util.*;
import java.io.*;

class Series{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int s=0,t1;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0 ; i< n ;j++)
            {
                t1 = a+b*(int)(Math.pow(2,j) );
                s= s+t1 ;
                System.out.print(s +" ");
            }
            System.out.println();
        }
        in.close();
    }
}
