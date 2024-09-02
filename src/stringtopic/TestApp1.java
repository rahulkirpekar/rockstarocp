package stringtopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		//             01234=5
//		String name = "royal";
//		for (int i = 0; i < name.length(); i++) 
//		{
//			System.out.println(name.charAt(i));
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name1 :  ");
		String name1 = sc.nextLine();
		System.out.println("Enter Name2 :  ");
		String name2 = sc.nextLine();
		
		
//		int result = name1.compareTo(name2);// same---0 / -1 | +1
		
		boolean result = name1.equals(name2);

		name1.charAt(0)
		
		
		if (result) 
		{
			System.out.println("Both Names are same");
		} else {
			System.out.println("NOt same");
		} 
	}
}
