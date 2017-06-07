import java.lang.Math.*;
public class IsInteger
{
	public static void main(String[] args) 
	{
		double x = Math.sqrt(4);
   int count = 0;
   if (x == (int)x)
    {
       System.out.print("X is an integer: " + x + "\n");
       count += 1; 
       System.out.print("This has been added to the count " + count + "\n");
    }else
   {
       System.out.print("X is not an integer: " + x + "\n");
       System.out.print("This has not been added to the count " + count + "\n");


   }
		
	}
}