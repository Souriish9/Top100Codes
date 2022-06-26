import java.util.*;

public class GettingStarted {
	public static void main(String[] args)
	{
		//PositiveOrNegative();
		//EvenOrodd();
		//SumFirstNaturalNumber();
		//SumOfNumberInRange();
		//GreatestOfThreeNumbers();
		//LeapYearCheck();
		PrimeNumberCheck();
	}
	
	public static void PositiveOrNegative()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		 if(num>=0)
		 {
			 System.out.println("+ve");
		 }
		 else
		 {
			 System.out.println("-ve");
		 }
		 
		 sc.close();
	}
	
	public static void EvenOrodd()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
		
		sc.close();
	}
	
	public static void SumFirstNaturalNumber()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		
		System.out.println("The sum is: "+sum);
		
		sc.close();
	}
	
	public static void SumOfNumberInRange()
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();
		
		int sum=0;
		for(int i=s;i<=e;i++)
		{
			sum+=i;
		}
		
		System.out.println("The sum is: "+sum);
		
		sc.close();
	}
	
	public static void GreatestOfThreeNumbers()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int greatest= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println(greatest);
		sc.close();		
	}
	
	public static void LeapYearCheck()
	{
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("LEAP!");
		}
		
		else
		{
			System.out.println("NON LEAP!");
		}
		
		sc.close();
	}
	
	public static void PrimeNumberCheck()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println("Prime!");
		}
		else
		{
			System.out.println("Non Prime!");
		}
	}
}
