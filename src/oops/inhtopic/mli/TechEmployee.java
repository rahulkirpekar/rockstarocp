package oops.inhtopic.mli;

import java.util.Scanner;

public class TechEmployee extends Employee
{
	String department;
	
	public void scanData() 
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter Id : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Salary : ");
		salary = sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter Department Name : ");
		department = sc.nextLine();
	}	
	public void dispData() 
	{
		System.out.println(id+" " + name+ " " + salary + " " + department);
	}
}
