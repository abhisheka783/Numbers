//all perfect # between 1 to 1000
class Program10 
{
	public static void main(String[] args) 
	{
		System.out.println("All perfect # between 1 to 1000 are");
		for (int j=1;j<=1000;j++)
		{
			if(isperfect(j))
				System.out.println(j);
		}
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
