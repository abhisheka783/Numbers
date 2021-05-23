//swap two number without using 3rd variable
import java.util.Scanner;
class Program17
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number ");
		int b=sc.nextInt();
		System.out.println("Before swapping value of a= "+a+" and b= "+b);
		swap(a,b);
		

	}
	public static void swap(int num1,int num2)
	{
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After swapping value of a= "+num1+" and b= "+num2);
	}
}