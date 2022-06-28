import java.util.*;

public class WorkingWNumbers {

	public static void main(String[] args)
	{
		//FindHcf();
		//FindGCD();
	}
	
	public static void FindGCD()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println(gcd(a,b));
		sc.close();
	}
	
	public static int gcd(int x, int y)
	{
		if(x==0)
			return y;
		if(y==0)
			return x;
		if(x==y)
			return x;
		if(x<y)
			return gcd(x,y-x);
		else
			return gcd(x-y,y);
	}
	public static void FindHcf()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int hcf=1;
		
		for(int i=1; i<a || i<b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		
		System.out.println(hcf);
		sc.close();
	}
}
