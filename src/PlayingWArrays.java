import java.util.*;

public class PlayingWArrays
{
	public static void main(String args[])
	{
		//FindGreatesAndSmallest();
		//AscendingArrays();
		DescendingArrays();
	}
	
	public static void DescendingArrays()
	{
		int arr[]=InputArray();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		PrintArray(arr);
	}
	
	public static void AscendingArrays()
	{
		int arr[]=InputArray();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		
		PrintArray(arr);
	}
	
	public static void FindGreatesAndSmallest()
	{
		Scanner sc=new Scanner(System.in);
		
		int arr[]=InputArray();
		int g=arr[0];
		int l=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>g)
			{
				g=arr[i];
			}
			
			if(arr[i]<l)
			{
				l=arr[i];
			}
		}
		
		sc.close();
		System.out.println("The greates number is: "+g+" and the lowest number is: "+l);
		
	}
	
	//Taking Input Of Arrays
	
	public static int[] InputArray()
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		return arr;
	}
	
	//Printing the Array
	
	public static void PrintArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
