package javaProgramming;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		//using 3rd variable
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping value of a and b : " +a +" " +b);
		// without using 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping value of a and b : " +a +" " +b);
		//using * and / operator but condition a and b should not be zero
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swapping value of a and b : " +a +" " +b);
		
		//single statement....it proceed right to left
		b=a+b-(a=b);
		System.out.println("after swapping value of a and b : " +a +" " +b);
	}
}
