import java.util.Scanner;
public class VarArg 
{
	public static void main(String... a) 
	{
		m1(new int[]{1,2,3});
		m1(new int[]{1});
		m1(new int[]{1,2});
		m1(new int[0]);
		m1(null);
		m1();
		m1(1);
		m1(10,20);
		m1(10,20,30);
		m1(10,20,30,40);
	}
	public static void m1(int...x)
	{
		System.out.println("VarArg method");
	}

	public static void m1(int x)
	{
		System.out.println("general method");
	}
}
