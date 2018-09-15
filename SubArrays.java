public class Solution {
	public static void main(String[] arhs){
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		for(int z=0;z<n;z++)
		{
			int i,or=0;
			int [] a1=new int [5];
			int [] b=new int [5];
			for(i=0;i<5;i++)
				{a1[i]=scan.nextInt();
					b1[i]=scan.nextInt();}
					int t1=0,k1=0,p1=0,n1=0;
					Arrays.sort(a1);
					Arrays.sort(b1);
					if(a1[i-1]==a1[i-5]+2 && b1[i-1]==b1[i-5]+2)
					{
						for(i=0;i<4&&t1!=2;i++)
							{if(a1[i]==a1[i+1])
								{
									t1++;
									k1=i;

									continue;}
								t1=0;}
								if(t1==2)
									{ for(int kk=0;kk<4&&n1!=2;kk++)
										{if(b1[kk]==b1[kk+1])
											{n1++;p1=kk; continue;}
											n1=0;
										}
										if(n1==2)
										{
											if((p1+k1)%2==1)
												{
													or=1;
												}
										}
									}
								}
								if(or==0)
									System.out.println("No");
								else
									System.out.println("Yes");
							}

						}

					}