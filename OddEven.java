import java.util.*;
class OddEven
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int a = sc.nextInt();
		if(a%2 == 0)
		{
			System.out.println(a + " is EVEN");
		}
		else
		{
			System.out.println(a + " is ODD");
		}
	}
}