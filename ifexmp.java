import java.util.*;
class ifexmp
{
	public static void main(String [] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter Name: ");
		String s = sc.nextLine();
		if(s.equals("Sunny"))
		{
			System.out.println("Hello Sunny");
		}
		else
		{
			System.out.print("Hello Guest");
		}
	}
}

