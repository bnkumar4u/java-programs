import java.util.Scanner;
public class CRICSCR 
{
	public static void main(String[] args) 
    {
			Scanner scan=new Scanner(System.in);
            int n,runs=0,wickets=0;
            boolean allOut=false;
            n=scan.nextInt();
            int []r=new int[n];
            int []w=new int[n];
            for (int i=0;i<n ;i++ )
            {      
                r[i]=scan.nextInt();
                w[i]=scan.nextInt();
            }
            for (int i=0;i<n ;i++ )
            {       
                if(runs<=r[i])
                    runs=r[i];
                else{
                    System.out.println("NO");
                    System.exit(0);
                }
                if(wickets<=w[i]&&w[i]<=10)
                    wickets=w[i];
                else{
                    System.out.println("NO");
                    System.exit(0);
                }
                if(allOut)
                {
                    System.out.println("NO");
                    System.exit(0);
                }
                if(wickets==10)
                    allOut=true;

            }

            System.out.println("YES");

	}
		
}
