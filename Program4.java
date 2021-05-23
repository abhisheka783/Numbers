//Sum of digits of given number
import java.util.Scanner;
class Program4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		int sum=sumof(num);
		System.out.println("sum of digits of given number is "+sum);
	}
	public static int sumof(int num)
	{
		int rem,sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}
}
