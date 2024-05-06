package Assignments;

public class Reversenumber {

	public static void main(String[] args)
	{
		int a= 1234 ,rev=0;
		while(a>0)
		{
		rev = (rev*10)+ (a%10);
		a=a/10;
	}
		System.out.println("The reverse of a given number is : "+rev);

}
}
