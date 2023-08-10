import java.util.*;
class palindrome
{
	public static void main(String [] args)
	{
		int rem,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number to check whether it is palindrome or not:  ");
		int num = sc.nextInt();
		
		int temp = num;

		while(num>0)
		{
			rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		if(temp == sum)
		{
			System.out.println(temp + " is a palindrome number");
		}
		else
		{
			System.out.print(temp + " is not palindrome number");
		}
	}
}