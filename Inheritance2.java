class B extends A 
{
	
	
	

	
	B()
	{
		a=20;
	    b='B';
	    s="I am in class B";
		System.out.println(a + b+s);
	}
	
}
class A
{

	int a=10;
	char b='A';
	String s="i am in class A";
	a=20;
	A()
	{
		System.out.println(a+b+s);
	}
}
public class Inheritance2	
{
	public static void main(String[] args) 
	{
		B obj = new B();
	}
}