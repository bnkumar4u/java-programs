import java.io.*;
import java.util.*;


public class RevPrintArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[1000];

        if(n>=1 && n<=1000)
        {


            for(int i=0; i <n; i++)
            {
                arr[i] = in.nextInt();

                if (!(arr[i] >=1 && arr[i]<= 10000))
                    break;

            }


            for (int j=n-1 ;j>=0 ;j--)
            {
                System.out.print(arr[j]+" ");
            }


        }
        in.close();
    }
}
