import java.util.*;
class specialJava
{
	public static void main(String [] args)
	{
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				for(k=1;k<=3;k++)
				{
					if(i==j || j==k || k==i)
					{
						continue;
					}	
					else
					{
						System.out.print(i+" "+j+" "+k+"\n");
					}
					
				}
			}
		}
	}
}