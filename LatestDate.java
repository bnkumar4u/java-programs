import java.util.Scanner;
import java.io.*;
public class LatestDate 
{
 public static void main(String[] args)throws IOException {
    Scanner scan = new Scanner(System.in);
    scan.useDelimiter(",");
    int a[]= new int[12];
    for(int i=0;i<12;i++)
        a[i]=scan.nextInt();

    System.out.println(a);

    

}
}


