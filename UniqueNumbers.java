import java.util.Scanner;
import java. util.HashSet;
import java.util.Iterator;
public  class UniqueNumbers
{//program to find unique numbers from a given set of
	//2*n+2 numbers
	public static void main(String[] args) {
		int t;
		Scanner scan = new Scanner(System.in);
		t= scan.nextInt();
		while(t-->0)
		{
			int n=scan.nextInt();
			HashSet h=new HashSet(2*n+2);
			for(int i=0; i<2*n+2;i++)
			{
				int x= scan.nextInt();
				if(h.contains(x))
				{
					h.remove(x);
				}
				else
				{
					h.add(x);
				}
			}
			Iterator itr= h.iterator();
			while(itr.hasNext())
			{
				System.out.print(itr.next()+" ");
			}
			System.out.println();
		}
	}
	
}