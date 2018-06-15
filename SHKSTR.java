import java.util.Scanner;
public class SHKSTR 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        String[] s=new String[n];
        for(int i=0; i<n ;i++)
            s[i]=scan.next();

        int q = scan.nextInt();
        for(int q_=0; q_<q ;q_++)
        {
            int r=scan.nextInt();
            String p=scan.next();
            String answer="";
            int len=-1;
            for(int i=0 ; i<r ; i++)
            {
                String temp=s[i];
                int tempLen=0;
                //We are at s[i]
                for(int j=0;j<s[i].length()&&j<p.length();j++)
                {
                    //We are at char of a single string s[i][j]
                    if(s[i].charAt(j)==p.charAt(j))
                    {
                        tempLen++;
                    }
                    else break;
                }
                if(tempLen>len)
                {
                    len=tempLen;
                    answer=s[i];
                }
                else if(tempLen==len &&s[i].compareTo(answer)<0)
                {
                    answer=s[i];
                }


            }
            System.out.println(answer);



        }
        
    }
}
