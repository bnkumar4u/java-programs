import java.util.Scanner;
public class CHEFWORK 
{
	public static void main(String[] args) 
    {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
            int [] c= new int[n];
                for (int i=0;i<n;i++)
                    c[i]=scan.nextInt();
            int [] t= new int[n];

                for (int i=0;i<n;i++)
                    t[i]=scan.nextInt();
            int min_a=5000000,min_b=5000000,min_c=5000000;
			for(int i=0;i<n;i++)
			{
                 if(t[i]==1&&c[i]<min_a)
                 {
                    min_a=c[i];
                 }
                 if(t[i]==2&&c[i]<min_b)
                 {
                    min_b=c[i];
                 }
                 if(t[i]==3&&c[i]<min_c)
                 {
                    min_c=c[i];
                 }
			}
            if (min_c<=(min_a+min_b)) {
                System.out.println(min_c);
            }
            else {
                System.out.println(min_a+min_b);
            }
	}
		
}
