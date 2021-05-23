//all the palindrome numbers between 10 to 1000
import java.util.Scanner;
class Program14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your initial value of range");
		int a=sc.nextInt();
		System.out.println("Enter your final value of range");
		int b=sc.nextInt();
		System.out.println("palindrome numbers between the range is ");
		for(int i=a;i<=b;i++)
		{
			if (ispalindrome(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean ispalindrome(int num)
	{
		int rem,rev=0,temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev==temp?true:false;
	}
}
