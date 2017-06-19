import java.util.Scanner;

public class AdaAndCrayons
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		in.nextLine();
		String s;
		if(T>=1&&T<=3000)
		{
			int[] ans =new int[T+1];
			for(int i=0;i<T;i++)
			{
				s=in.nextLine();
				char[] ch =s.toCharArray();
				int a=0,b=0;

				for(int j=0;j<ch.length-1;j++)
				{
					if(ch[j]=='U'&&ch[j+1]=='D')
						a++;
					if(ch[j]=='D'&&ch[j+1]=='U')
						b++;

				}
				if(a>=b)
					ans[i]=a;
				else
					ans[i]=b;


			}
			for(int i=0;i<T;i++)
				System.out.println(ans[i]);



		}


	}
}