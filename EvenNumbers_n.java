import java.util.Scanner;

public class EvenNumbers_n {
    public static void main(String[] args){
        int i,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of even numbers needed");
        n=s.nextInt();
        System.out.println("The first "+n+" even numbers are :");
        for(i=2;n!=0;i=i+2,n--)
        System.out.print(i+"  ");
    }
}
