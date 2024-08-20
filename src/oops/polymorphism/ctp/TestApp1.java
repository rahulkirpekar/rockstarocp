package oops.polymorphism.ctp;

public class TestApp1 
{
	// Method Overloadding
	public void addFun(long no1,long no2) 
	{
		System.out.println("addFun(long no1,long no2) ");
	}
	public void addFun(double no1,double no2) 
	{
		System.out.println("addFun(double no1,double no2) ");
	}
	public void addFun(int no1,int no2,int no3) 
	{
		System.out.println("addFun(int no1,int no2,int no3) ");
	}
	public void addFun(int no1,int no2,int no3,int no4,int no5) 
	{
		System.out.println("addFun(int no1,int no2,int no3,int no4,int no5) ");
	}
	
//	public void addFun(char b , int...a) 
//	{
//		for (int i = 0; i < a.length; i++) 
//		{
//			System.out.println("A["+i+"] " + a [i]);
//		}
//		System.out.println("addFun(long no1,long no2) ");
//	}
	
	public static void main(String...args) 
	{
		TestApp1 obj = new TestApp1();
		
		obj.addFun('a','b','c','d','e');//int--->int-->long--->float-->double
		
	}
}
/*
	Method Overloadding
	
	1) argument count
	2) arg vlaue--->type
	3) Type Pramotion Rule
	
	
					Type Pramotion Rule
					---------------------
		boolean---Not Pramoted			
						
					
					byte
					 |
					short
					 |
char--------------->int
					 |
					long  	
				     |
				    float 
					 |
					double 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
*/