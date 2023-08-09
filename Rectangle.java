import java.util.*;
class Rectangle
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Lenght: ");
		int l = sc.nextInt();
		System.out.print("Enter Width: ");
		int w = sc.nextInt();
		int area = l*w;
		int perimeter = 2*(l*w);
		
		System.out.println("The Area of Rectangle is: " + area);
		System.out.println("The Perimeter of Rectangle is: " + perimeter);
	}
}