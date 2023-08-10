import java.util.*;
class fibo
{
	public  static void main(String [] args)
	{
		int n1=0,n2=1,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("How Many Steps You Want to print: ");
		int count = sc.nextInt();
		
		if(count == 1)
		{
			System.out.print(n1);
		}
		else if(count == 2)
		{
			System.out.print(n1 + " " + n2);
			
		}
		else
		{
			System.out.print(n1 + " " + n2);
			for(i=2;i<count;i++)
    			{
 				int n3=n1+n2;    
 				System.out.print(" "+n3);    
  				n1=n2;    
  				n2=n3;    
 	       		}    
  
		}
	}
} 