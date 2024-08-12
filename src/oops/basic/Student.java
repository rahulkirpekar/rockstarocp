package oops.basic;

import java.util.Scanner;

// Java Bean[POJO]---[Pure Encapsulation]--JDBC
public class Student 
{
	private int rno;
	private String name;
	private int std;
	
	// Mutators(setters) / Accessors(getters)
	
	// setters
	public void setRno(int rno) 
	{
		this.rno=rno;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public void setStd(int std) 
	{
		this.std=std;
	}
	
	// getters
	public int getRno() 
	{
		return rno;
	}
	public String getName() 
	{
		return name;
	}
	public int getStd() 
	{
		return std;
	}
	public void scanData() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name =sc.nextLine();
		System.out.println("Enter Std : ");
		std =sc.nextInt();
	}
	public void dispData() 
	{
		System.out.println(rno+" " + name+" " + std);
	}
}