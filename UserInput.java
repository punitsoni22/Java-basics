import java.util.*;
class UserInput
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number- ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number- ");
		int b = sc.nextInt();
		System.out.print("Enter third number- ");
		int c = sc.nextInt();
		int d = a+b+c;
		System.out.println("Total= " +d);
	}
}