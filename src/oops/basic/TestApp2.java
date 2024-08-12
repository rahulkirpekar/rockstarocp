package oops.basic;

public class TestApp2 
{
	public static void main(String[] args) 
	{
		Student s[] = new Student[5];
		
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = new Student();
			s[i].scanData();
		}
		
		for (int i = 0; i < s.length; i++) 
		{	
			s[i].dispData();
		}
//		Student s1 = new Student();//s1-->[rno name std]
//		Student s2 = new Student();//s2-->[rno name std]
//		Student s3 = new Student();//s3-->[rno name std]
//
//		s1.scanData();
//		s2.scanData();
//		s3.scanData();
//		
//		s1.dispData();
//		s2.dispData();
//		s3.dispData();
		
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("Enter Rno : ");
//		s1.rno = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name : ");
//		s1.name = sc.nextLine();
//		System.out.println("Enter Std : ");
//		s1.std = sc.nextInt();
//		
//		
//		System.out.println("Enter Rno : ");
//		s2.rno = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name : ");
//		s2.name = sc.nextLine();
//		System.out.println("Enter Std : ");
//		s2.std = sc.nextInt();
//		
//
//		System.out.println("Enter Rno : ");
//		s3.rno = sc.nextInt();
//		sc.nextLine();
//		System.out.println("Enter Name : ");
//		s3.name = sc.nextLine();
//		System.out.println("Enter Std : ");
//		s3.std = sc.nextInt();
//
//		System.out.println(s1+"----"+s1.rno+" " + s1.name+" " + s1.std);
//		System.out.println(s2+"----"+s2.rno+" " + s2.name+" " + s2.std);
//		System.out.println(s3+"----"+s3.rno+" " + s3.name+" " + s3.std);
//		
//		
		
	}
}
