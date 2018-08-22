import java.util.Scanner;
public class PCJ18C
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();

		for(int t_=0;t_<t;t_++)
		{
			int n=scan.nextInt();
			int a1=scan.nextInt();
			int k=scan.nextInt();

			int s=(n-2)*180;
			int d =((2*s)/n - 2*a1)/(n-1);
			int ak = a1 + (k-1)*d;
			System.out.println(ak+ " 1");

		}

	}
}