import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String args[]){
        int a[]=new int[50],n,i;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        n=in.nextInt();
        System.out.println("Enter the elements");

        for(i=0;i<n;i++)
            a[i]=in.nextInt();

        System.out.println("Enter an element to delete");

        int x=in.nextInt();

        for(i=0;i<n;i++)
        {
            if(a[i]==x)
            {
                for(int j=i;j<n-1;j++)
                       a[j]=a[j+1];

                   n--;
                   i--;
            }

        }
        System.out.println("After deletion of "+x+" the elements are");

        for(i=0;i<n;i++)
            System.out.print(a[i]+"   ");


    }
}
