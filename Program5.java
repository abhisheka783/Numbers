//check of palindrome or not
import java.util.Scanner;
class Program5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(ispalindrome(num))
			System.out.println(num+" is a palindrome number");
		else
			System.out.println(num+" is not a palindrome number");
	}
	public static boolean ispalindrome(int num)
	{
		int temp=num,rev=0,rem;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev==temp?true:false;
	}
}
