package com.acadgild;

public class array {

		
		public static int add(int n[])
		{
			int sum;
			sum=0;
			for (int i=0;i<n.length;i++)
			{
				sum=n[i]+sum;
			}
			return sum;
		}
		
		public static void main(String[] args) {
			array ar=new array();
			int a[]={1,2,4,5,6,7,1,32};
			int sumofarray;
		
			sumofarray=array.add(a);
			System.out.println("Addition of Array : "+ sumofarray);
				
		}
}
