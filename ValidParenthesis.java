import java.util.Scanner;
import java.util.Stack;
public class ValidParenthesis
{
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		int t1= scan.nextInt();
		while(t1-->0)
		{
			int valids=0,temp=-1;
			String str= scan.next();
			for(int i=0;i<str.length()-1;i++)
			{
				for(int j=i+2; j<=str.length(); j++)
				{
					String str1 = str.substring(i,j);
					if(str1.charAt(0)=='('){
						temp=checkValidation(str1);
						if(temp>valids)
							valids=temp;
					}
				}

			}
			System.out.println(valids);
//////////////////////////////////
			/*{
			char[] c= str.toCharArray();
			int valids=0, t=0;
			Stack<Character> s=new Stack<Character>();
			for(char ch:c)
			{
				if(ch=='(')
					s.push('(');
				else if(ch == ')')
				{
					if(!s.empty()&&s.peek()=='(')
					{
						s.pop();
						t=t+2;
					}
					else{
						valids = valids+t;
						t=0;
					}
				}
			}
			valids = valids +t;
			t=0;
			System.out.println(valids);}
*/
		}
	}
	static int checkValidation(String str)
	{
		char[] c= str.toCharArray();
			Stack<Character> s=new Stack<Character>();
			for(char ch:c)
			{
				if(ch=='(')
					s.push('(');
				else if(ch == ')')
				{
					if(!s.empty()&&s.peek()=='(')
					{
						s.pop();
					}
					else{
						return -1;
					}
				}
			}

			if(s.empty())
				return str.length();
			return -1;
	}
}

/*********************************************************/
import java.io.*;
class GFG
 {
	public static void main (String[] args)throws IOException
	 {
	     GFG obj=new GFG();
	     obj.go();
	 }
	 int findMaxLen(String str)
    {
        int n = str.length();
      
        // Create a stack and push -1 as initial index to it.
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
      
        // Initialize result
        int result = 0;
      
        // Traverse all characters of given string
        for (int i=0; i<n; i++)
        {
            // If opening bracket, push index of it
            if (str.charAt(i) == '(')
              stk.push(i);
      
            else // If closing bracket, i.e.,str[i] = ')'
            {
                // Pop the previous opening bracket's index
                stk.pop();
      
                // Check if this length formed with base of
                // current valid substring is more than max 
                // so far
                if (!stk.empty())
                    result = Math.max(result, i - stk.peek());
      
                // If stack is empty. push current index as 
                // base for next valid substring (if any)
                else stk.push(i);
            }
        }
      
        return result;
    }
	 public void go()throws IOException
	 {
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     int t=Integer.parseInt(br.readLine()),count,i,l,max;
	     String str="";
	     char c;
	     while(t-->0)
	     {
	         System.out.println(findMaxLen(br.readLine()));
	     }
	 }
}