//sum of all prime number between 50 to 100
import java.util.Scanner;
class Program11 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your initial value of range");
		int a=sc.nextInt();
		System.out.println("Enter your final value of range");
		int b=sc.nextInt();
		System.out.println("sum of all the prime numbers between the range is ");
		System.out.println(sumprime(a,b));
	}
	public static boolean checkprime(int num)
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
	public static int sumprime(int a,int b)
	{
		int sum=0;
		for (int i=a;i<=b;i++)
		{
			boolean isprime=checkprime(i);
				if(isprime)
					sum=sum+i;
		}
		return sum;
	}
}
