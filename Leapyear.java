package com.bl;

public class Leapyear {
	public static void main(String args[])
	{

	System.out.println("ENTER YEAR");
	Scanner sc=new Scanner(System.in);
	int year=sc.nextInt();
	if(year >= 1582)
	{
	if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))

	{
		System.out.println("Given year is Leap Year");
	}
	else
	{
		System.out.println("Given year is Not Leap Year");
	}
	}
	else
		System.out.println("Given year is less than 1582");
	}

}
