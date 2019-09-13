
import java.util.Scanner;
class Sub
{
	public static void main(String args[])
	{
		int p, q, r;
		System.out.println("Enter two integers to calculate their substraction: ");
		Scanner sc = new Scanner(System.in); 
		p = sc.nextInt(); 
		q = sc.nextInt();
		r = p - q;
			System.out.println("subtraction of entered integers = "+r);
	}
} 
