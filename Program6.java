//print all the factors of given number
import java.util.Scanner;
class Program6
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		factorof(num);
	}
	public static void factorof(int num)
	{
		System.out.println("factors of given number");
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
