package Assignments;
import java.util.Scanner;


public class Palindromenumber {

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number to check if it is palindrome:");
	int num=scan.nextInt();
	
	int actualnum= num;
	int rev=0;
	while(num>0)
	{
		rev= (rev*10) + (num%10);
		num=num/10;
	}
	System.out.println("The reverse of the given number is  :"+rev);
	
	
	if(actualnum == rev)
	{
		System.out.println("The given number is  a palindrome number!!");
		
	}else
	{
		System.out.println("The given number is not a palindrome number");
		
	}

	}

}
