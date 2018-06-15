import java.util.Scanner;
public class NAICHEF 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        for(int t_=0;t_<t;t_++)
        {
            int n=scan.nextInt();

            int a=scan.nextInt();

            int b=scan.nextInt();
            int[] x=new int[n];

            int x1=0,x2=0;
            for(int i=0;i<n;i++){
                x[i]=scan.nextInt();
                if(x[i]==a)
                    x1++;
                if(x[i]==b)
                    x2++;
            }

            double d1=((double)x1)/n;
            double d2=((double)x2)/n;
            System.out.println(d1*d2);   
        }
    }
}
