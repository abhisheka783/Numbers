//wap to print all strong number between 1 to 10000
import java.util.Scanner;
class Program12 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your initial value of range");
		int a=sc.nextInt();
		System.out.println("Enter your final value of range");
		int b=sc.nextInt();
		System.out.println("strong numbers between the range is ");
		for(int i=a;i<=b;i++)
		{
			if (strong(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean strong(int num)
	{
		int rem,sum=0,temp=num;
		while(num>0)
		{
			sum+=fact(num%10);
			num/=10;
		}
		return temp==sum?true:false;
	}
	public static int fact(int num)
	{
		int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}

}
