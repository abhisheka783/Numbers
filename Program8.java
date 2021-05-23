//print factorial of given number
import java.util.Scanner;
class Program8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		System.out.println("Facorial of "+num+" is "+factorialof(num));
	}
	public static int factorialof(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
