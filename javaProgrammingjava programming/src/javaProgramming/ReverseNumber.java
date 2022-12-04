package javaProgramming;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number : ");
		int num=sc.nextInt();
		//using algorithm
		/*int rev=0;
		while(num!=0)
		{
			rev=rev*10 + num%10;
			
		    num=num/10;
			
		}*/
		
		//using StringBuffer class
		
		StringBuffer rev;
		StringBuffer sb= new StringBuffer(String.valueOf(num));
		rev=sb.reverse();
		System.out.println("reverse number is : "+rev);
		System.out.println("program is done");
	}

}
