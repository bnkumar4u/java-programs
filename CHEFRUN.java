import java.util.Scanner;
public class CHEFRUN 
{
	public static void main(String[] args) 
    {
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
        for(int t_=0;t_<t;t_++)
        {     
            int x1,x2,x3,v1,v2;
            double t1,t2;
            x1=scan.nextInt();
            x2=scan.nextInt();
            x3=scan.nextInt();
            v1=scan.nextInt();
            v2=scan.nextInt();

            t1=(double)(x1-x3)/(double) v1;
            t2=(double)(x2-x3)/(double) v2;
            if(t1<0)
                t1=t1*(-1);
            if(t2<0)
                t2=t2*(-1);

            if (t1<t2) 
                System.out.println("Chef");
            else if(t2<t1)
                System.out.println("Kefa");
            else
                System.out.println("Draw");

        }
    }
}
