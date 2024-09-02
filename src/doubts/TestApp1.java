package doubts;

public class TestApp1 
{
	// var args - Variable Arguments
	
	public static int addFun(float no1 , int...a ) 
	{
		System.out.println("NO : "+no1);
		int sum = 0 ; 
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];
		}
		return sum;
	}	
	public static void main(String...args) 
	{
		int sum = addFun(10);
		
		System.out.println("Sum : " + sum);
	}
}
