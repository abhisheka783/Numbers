//program on even and odd
import java.util.Scanner;
class Program1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		if(check(num))
			System.out.println(num+" is a even number");
		else
			System.out.println(num+" is a odd number");
	}
	public static boolean check(int num)
	{
		//return num%2==0?true:false;
		//return num/2*2==num?true:false;
		//return (num & 1)==0?true:false;
		//return num%2==0;
		return num/2*2==num;
	}
}
