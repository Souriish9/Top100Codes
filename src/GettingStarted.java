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
		//PrimeNumberCheck();
		//PrimeNumberRange();
		//SumOfDigits();
		//ReverseANumber();
		//PalindromeNumber();
		//AmstrongChecker();
		//AmstrongNumberIntervals();
		//FibonacciNormal();
		//FibonacciRec();
		//FiboArray();
		//Factorial();
		//FactorsOfANumber();
		PrimeFactorsOfNumber();
	}
	
	public static void PrimeFactorsOfNumber()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0 && isPrime(i))
			{
				System.out.println(i+" ");
			}
		}
		
		sc.close();
	}
	
	static boolean isPrime(int num)
	{
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
			return true;
		else
			return false;
	}
	
	public static void FactorsOfANumber()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
			}
		}
		
		sc.close();
	}
	
	public static void Factorial()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println(fact(num));
		sc.close();
	}
	
	public static int fact(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return (n*fact(n-1));
	}

	public static void FiboArray()
	{
		Scanner sc=new Scanner(System.in);
		int lim=sc.nextInt();
		
		int[] fibo=new int[lim];
		
		fibo[0]=0;
		fibo[1]=1;
		
		for(int i=2;i<lim;i++)
		{
			fibo[i]=fibo[i-1]+fibo[i-2];
		}
		
		for(int x=0;x<lim;x++)
		{
			System.out.print(fibo[x]+" ");
		}
		
		sc.close();
	}

	public static void FibonacciRec()
	{
		Scanner sc=new Scanner(System.in);
		int lim=sc.nextInt();

		for(int i=0;i<lim;i++)
		{
			System.out.println(fibrecursion(i));
		}
		sc.close();
	}

	public static int fibrecursion(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return (fibrecursion(n-1) +fibrecursion(n-2));
	}

	public static void FibonacciNormal()
	{
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int a=0,b=1,c;
		System.out.print("0 1 ");

		for(int i=3;i<=limit;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}

		sc.close();
	}

	public static void AmstrongNumberIntervals()
	{
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int e=sc.nextInt();

		for(int i=s;i<=e;i++)
		{
			if(AmstrongCheckerBool(i)==true)
				System.out.println(i +" ");
		}

		sc.close();
	}

	public static boolean AmstrongCheckerBool(int num)
	{
		int digits=NoOfDigits(num);
		int temp=num,rem,sum=0;

		while(num!=0)
		{
			rem=num%10;
			sum=sum+(int)Math.pow(rem, digits);
			num/=10;
		}

		if(sum==temp)
			return true;
		else
			return false;
	}

	public static void AmstrongChecker()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int digits=NoOfDigits(num);
		int temp=num,rem,sum=0;

		while(num!=0)
		{
			rem=num%10;
			sum=sum+ (int)Math.pow(rem, digits);
			num/=10;
		}

		if(sum==temp)
			System.out.println("Amstrong!" +sum);
		else
			System.out.println("Needs to be strong! "+sum);

		sc.close();
	}

	public static int NoOfDigits(int num) //for AmstrongCheck
	{
		int count=0;
		while(num!=0)
		{
			count++;
			num/=10;
		}

		return count;
	}

	public static void PalindromeNumber()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int temp=num;
		int rev=0,rem;

		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}

		if(rev==temp)
			System.out.println("Plaindrome!");
		else
			System.out.println("Not a Palindrome Number!");
		
		sc.close();
	}

	public static void ReverseANumber()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int rev=0,rem;

		while(num!=0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}

		System.out.println(rev);
		sc.close();
	}

	public static void SumOfDigits()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int sum=0,rem;

		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}

		System.out.println("the sum of digits is: "+sum);
		sc.close();
	}

	public static void PrimeNumberRange()
	{
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int last=sc.nextInt();

		int count;

		for(int i=first;i<=last;i++)
		{
			count=0;
			for(int m=1;m<=i;m++)
			{
				if(i%m==0)
				{
					count++;
				}
			}

			if(count==2)
			{
				System.out.println(i+" ");
			}
		}

		sc.close();
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
		
		sc.close();
	}
}
