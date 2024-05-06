package Assignments;

import java.util.Arrays;

public class D7sortnumbers {

	public static void main(String[] args)
	{
		int a[]= {10,99,20,39,40,18,9};
		int temp;
		System.out.println("Before sorting "+Arrays.toString(a));
		 /*
		Arrays.sort(a);;
		System.out.println("After sorting"+Arrays.toString(a));
		*/
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
				if (a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
							
				}
		
		}
			System.out.println("After sorting  :"+Arrays.toString(a));
		}

}
