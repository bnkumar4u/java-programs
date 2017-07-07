// Nitika was once reading a history book and wanted to analyze it. So she asked her brother to create a list of names of the various famous personalities in the book. Her brother gave Nitika the list. Nitika was furious when she saw the list. The names of the people were not properly formatted. She doesn't like this and would like to properly format it.

// A name can have at most three parts: first name, middle name and last name. It will have at least one part. The last name is always present. The rules of formatting a name are very simple:

// Only the first letter of each part of the name should be capital.
// All the parts of the name except the last part should be represented by only two characters. The first character should be the first letter of the part and should be capitalized. The second character should be ".".
// Let us look at some examples of formatting according to these rules:

// gandhi -> Gandhi
// mahatma gandhI -> M. Gandhi
// Mohndas KaramChand ganDhi -> M. K. Gandhi



import java.util.Scanner;
public class RenameStrings
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);

		int T= scan.nextInt();
		scan.nextLine();

		for(int i=0;i<T;i++)
		{
			int counter=0,c1=0,c2=0;
			String s=new String();

			String s1=new String();

			s=scan.nextLine();

			s=s.toLowerCase();

			char []c=s.toCharArray();
			if(c[0]>='a'&&c[0]<='z')
				{//c[0]=c[0]-32;
				c[0]-=32;}

			// s1=""+c[0];

			for(int j=2;j<c.length;j++)
			{
				if(c[j]==' ')
					{
						counter++;
						c2=c1;
						c1=j;

					}
			}
			if(counter==0)
				s1 = String.valueOf(c);
			else if(counter ==1)
			{
				s1=""+c[0]+". ";

				if(c[c1+1]>='a'&&c[c1+1]<='z')
					c[c1+1]-=32;
				    //c[c1+1]=c[c1+1]-32;


				s1=s1+c[c1+1];

				for(int j= c1+2;j<c.length;j++)
				{
					s1=s1+c[j];
				}
			}
			else if(counter==2)
			{
				s1=""+c[0]+". ";

				if(c[c2+1]>='a'&&c[c2+1]<='z')
					c[c2+1]-=32;
				    //c[c2+1]=c[c2+1]-32;

				s1=s1+c[c2+1]+". ";

				

				if(c[c1+1]>='a'&&c[c1+1]<='z')
					c[c1+1]-=32;
				    //c[c1+1]=c[c1+1]-32;

				s1=s1+c[c1+1];

				for(int j= c1+2;j<c.length;j++)
				{
					s1=s1+c[j];
				}


			}

			System.out.println(s1);


		}
	}
}