//count the Number of Digits
import java.util.Scanner;
class Program2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number");
		int num=sc.nextInt();
		int count=countdigit(num);
		System.out.println("Total number of digits are "+count);
	}
	public static int countdigit(int num)
	{
		if(num==0)
			return 1;
		else
		{
			int count=0;
			while(num>0)
			{
				count++;
				num=num/10;
			}
			return count;
		}
	}
}

