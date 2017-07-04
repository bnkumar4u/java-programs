import java.util.Scanner;

public class ExceptionStoI 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a String");

        String S = in.next();
        try
        {

        	int i=Integer.parseInt(S);

        	System.out.println("String Successfully converted to Integer");

        	System.out.println(i);
        }
        catch(NumberFormatException n)
        {
        	System.out.println("Bad String");
        }

	}
}