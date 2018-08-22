import java.util.Scanner;
public class NUMCOMP 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();

        for(int t_=0;t_<t ; t_++)
        {
            int a =scan.nextInt();
            int b=scan.nextInt();
            int n=scan.nextInt();
            
            if(n%2==1)
            {
                //odd
                if(a>b)
                    System.out.println("1");
                else if(a<b) System.out.println("2");
                else System.out.println("0");
            }
            else
            {
                //even
                double x=(double)a*(double)a;
                double y=(double)b*(double)b;
                if(x>y)
                    System.out.println("1");
                else if(x<y) System.out.println("2");
                else System.out.println("0");
            }             


        }
        
    }
}
