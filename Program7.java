//check whether the number is perfect or not
import java.util.Scanner;
class Program7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(isperfect(num))
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
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
