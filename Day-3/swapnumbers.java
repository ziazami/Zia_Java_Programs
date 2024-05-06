package Assignments;

public class swapnumbers {

	public static void main(String[] args)
	{
		int a= 10;
		int b=20;
		int temp;
		
		/*System.out.println("Before Swapping  :a= "+a+"   b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping  :a= "+a+" b=  "+b);
		*/
		
		System.out.println("Before Swapping  :a= "+a+"   b="+b);
		a= a+b;  //30
		b=a-b; //10
		a=a-b;//20
		System.out.println("After Swapping  :a= "+a+" b=  "+b);
		
		
		

	}

}
