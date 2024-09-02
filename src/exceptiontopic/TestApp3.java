package exceptiontopic;

import java.util.Scanner;

public class TestApp3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1 : "); 
		int no1 = sc.nextInt();
		System.out.println("Enter No2 : "); 
		int no2 = sc.nextInt();
		
		int ans = 0;
		
		try 
		{
			// raise exception by code
			ans = no1 / no2;// exception--recover---Exception Handling
		} 
		finally 
		{
			System.out.println("Hi I am Finally Block");
		}
		
		
/*		
		try 
		{
			// raise exception by code
			ans = no1 / no2;// exception--recover---Exception Handling
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("Hi I am Finally Block");
		}
		
	*/	
		System.out.println("Ans : " + ans);
	}
}