package Assignments;
import java.util.Scanner;
public class D5countnumofdigits {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a given number  :");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count+=1;
		}
		System.out.println("The number of digits in the number is "+count);
	

	}

}
