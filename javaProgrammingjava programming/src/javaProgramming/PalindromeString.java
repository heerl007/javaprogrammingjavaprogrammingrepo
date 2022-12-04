package javaProgramming;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a string : ");
		String str=sc.next();
		String orig = str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		
		System.out.println("reverse string is : "+rev);
		if(rev==orig)
		{
			System.out.println("string is palindrome");
		}
		else
		{
			{
				System.out.println("string is not palindrome");
			}
		}
			
		

	}

}
