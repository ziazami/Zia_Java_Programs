package Assignments;

import java.util.Arrays;

public class D7smallestinarray {

	public static void main(String[] args)
	{
		int a[]= {10,9,4,22,99};
		int smallest=a[0];
		System.out.println("The array elements are"+Arrays.toString(a));
		for(int i =1;i<a.length;i++)
		{
			if(a[i]<smallest)
			{
				smallest=a[i];
				
			}
				
		}
		System.out.println("The Smallest number in the array"+smallest);


	}

}
