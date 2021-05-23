//wap to check whether the given number is automorphic or not
import java.util.Scanner;
class  Program15
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(isautomorphic(num))
			System.out.println("Automorphic");
		else
			System.out.println("Not an Automorphic");

	}
	public static boolean isautomorphic(int num)
	{
		System.out.println("original number "+num);
		int square=num*num;
		System.out.println("square number "+square);
		while(num>0)
		{
			if((num%10) != (square%10))
				return false;
			num/=10;
			square/=10;
		}
		return true;
	}
}
