import java.util.*;
class checknum
{
	public static void main(String [] args)
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num + " is Positive");
		}
		else if(num<0)
		{
			System.out.println(num + " is Negative");
		}
		else
		{
			System.out.println(num + " is Zero");
		}
	}
}