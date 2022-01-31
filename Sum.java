package com.bl;

public class Sum {
	public static void main(String args[])
	{
	int sum=0;
	int count=0;
	for(int i=0;i<args.length;i++)
	{
		try
		{
		int val=Integer.parseInt(args[i]);
		sum=val+sum;
		}
	
		catch(NumberFormatException e)
		{
		count++;

		}
	}
	System.out.println("Sum of valid integers"+sum);
	System.out.println("Invalid integers"+count);
	
	}
}
