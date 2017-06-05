import java.util.Scanner;

public class EvenUpto_n {
public static void main(String[] args){
    int i,n;
    System.out.println("enter a number");
Scanner s = new Scanner(System.in)    ;
    n=s.nextInt();
    if(n>=2){
    System.out.println("Even numbers upto "+n+" are :");
    for(i=2;i<=n;i=i+2)
        System.out.print(i+"  ");}
    else
        System.out.println("enter a valid number (>=2)");

}
}
