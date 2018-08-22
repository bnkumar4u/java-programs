import java.util.Scanner;
public class AllSubstrings
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+2; j<=s.length(); j++)
			{
				System.out.println(s.substring(i,j));
			}
		}

	}
}