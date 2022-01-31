package com.bl;

public class Palindrome {
	public static void main(String args[])
	{
		int n=545,r,s=0;
		int t=n;
		while(n>0)
		{
			r=n%10;
		    n=n/10;
		    s=s*10+r;
		} 
		System.out.print(s);
		if (t==s)
			System.out.print("Palindrome");
		else
			System.out.print("Not palindrome");
		
	}


}
