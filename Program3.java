//check of prime number or not
import java.util.Scanner;
class Program3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(isprime(num))
			System.out.println(num+" is a prime number");
		else
			System.out.println(num+" is not a prime number");
	}
	public static boolean isprime(int num)
	{
		if(num==1)
			return false;
		else
		{
			for (int i=2;i<num;i++)
			{
				if(num%i==0)
					return false;
			}
		}
		return true;
	}
}
