package javaProgramming;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="system";
		//String rev=null;
		String rev="";
		/*int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("reverse string is : "+rev);*/
		
		//using character array
		/*char a[] = str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
		System.out.println("reverse string is : "+rev);

	}*/

	//using stringbuffer class
	
	StringBuffer sb= new StringBuffer(str);
	System.out.println(sb.reverse());

}
}
