package exceptiontopic;

import java.util.Scanner;

public class TestApp1 
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
			
			String value = "a1b0";
			int no = Integer.parseInt(value);// raise NumberformateException
			System.out.println(no);// 10
	
			int a[] = new int[5];//a[0],a[1],a[2],a[3],a[4]
			a[5] = 10;// raise ArryaIndexoufofBoundException
			System.out.println(a[0]);
			
		}
		catch(ArithmeticException | NullPointerException | NumberFormatException e) 
		{
			System.out.println("Exception Handled---"+ e.getClass().getName());
		}
//		catch(NullPointerException e) 
//		{
//			System.out.println("Exception Handled---"+ e.getClass().getName());
//		}
//		catch(ArithmeticException e) 
//		{
//			System.out.println("Exception Handled---"+ e.getClass().getName());
//		}	
		catch(Exception e) 
		{
			System.out.println("Exception Handled---"+ e.getClass().getName());
		}
		
		System.out.println("Ans : " + ans);
	}
}
