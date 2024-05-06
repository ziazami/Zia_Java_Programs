package Assignments;

public class Smallestnumber {

	public static void main(String[] args) 
	{
		int a= 100, b=200 , c=30;
		if(a<b && a<c)
		{
			System.out.println("The smallest of 3 numbers is : "+a);
		}else if(b<a && b<c)
		{
			System.out.println("The smallest of 3 numbers is "+b);
		}
		else
			System.out.println("The smallest of 3 numbers is "+c);
		

	}

}
