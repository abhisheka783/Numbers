//multpling two number without using *
import java.util.Scanner;
class Program16
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		System.out.println("product of "+a+" and "+b+ " is " +sum(a,b));

	}
	public static int sum(int num,int b)
	{
		int product=0;
		for(int i=1;i<=b;i++)
		{
			product+=num;
		}
		return product;
	}
}
