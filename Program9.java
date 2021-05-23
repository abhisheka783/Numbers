//check whether the number is Strong/special or not
import java.util.Scanner;
class Program9
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(isstrong(num))
			System.out.println(num+" is a strong number");
		else
			System.out.println(num+" is not a strong number");
	}
	public static boolean isstrong(int num)
	{
		int rem,sum=0,temp=num;
		while(num>0)
		{
			sum+=fact(num%10);
			num/=10;
		}
		return sum==temp?true:false;
	}
	public static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
