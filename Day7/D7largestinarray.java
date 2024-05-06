package Assignments;

import java.util.Arrays;

public class D7largestinarray {

	public static void main(String[] args) 
	{
		int a[]= {10,9,4,22,99};
		int largest=a[0];
		System.out.println("The array elements are"+Arrays.toString(a));
		for(int i =1;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
				
			}
				
		}
		System.out.println("The largest number in the array"+largest);

	}
		
	}
	

