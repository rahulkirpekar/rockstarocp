package exceptiontopic;

import java.io.IOException;
import java.util.Scanner;

public class TestApp4 
{
//	public static void isValidForVote(int age) throws IOException
//	public static void isValidForVote(int age) //throws ArithmeticException
//	public static void isValidForVote(int age) throws InvalidAgeException
	public static void isValidForVote(int age)
	{
		if (age < 18) 
		{
			// raise exception---custom Scenario---CustomException
			// raise exception
//			throw new IOException("Invalid Age,\n\t Please enter valid Age");
//			throw new ArithmeticException("Invalid Age,\n\t Please enter valid Age");
			
			throw new InvalidAgeException("\n\"Invalid Age,\n\t Please enter valid Age\"");
			
		} else 
		{
			System.out.println("Welcome for Vote");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		try 
		{
			isValidForVote(age);
			
		} catch (InvalidAgeException e) 
		{
			System.out.println("Exception Handled in Catch Block");
			e.printStackTrace();
		}
		
		System.out.println("Exit main");
	}
}
