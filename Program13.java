//print all the perfect number between the range
import java.util.Scanner;
class Program13
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your initial value of range");
		int a=sc.nextInt();
		System.out.println("Enter your final value of range");
		int b=sc.nextInt();
		System.out.println("perfect numbers between the range is ");
		for(int i=a;i<=b;i++)
		{
			if (isperfect(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isperfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum+=i;
			}
		}
		return sum==num?true:false;
	}
}
