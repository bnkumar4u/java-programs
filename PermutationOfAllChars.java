import java.util.Scanner;
public class PermutationOfAllChars{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.next();

		printPermutations(s,0,s.length()-1);
	}
	static void printPermutations(String s,int left,int right)
	{
		if(left==right){
			System.out.println(s);
			return;
		}
		for(int i=left;i<=right;i++){
			s = swap(s,left,i);
			printPermutations(s,left+1,right);
			s = swap(s,left,i);
		}
	}
	public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	
}