package Assignments;

import java.util.Scanner;

public class D6sumofnumbersinarray {

	public static void main(String[] args) {
		int sum=0;
		
		int a[]= {10,20,30,40,50,60,70};
		
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("The sum of array numbers are: "+sum);
	}
		
	}