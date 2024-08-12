package oops.inhtopic.consdemo;

public class C extends B
{
	int no3;
	public C(int no1,int no2,int no3) 
	{
		super(no1,no2);
		this.no3 = no3;
		System.out.println("C:: PARA Constructor ");
	}
	public void disp() 
	{
		System.out.println(no1+" " + no2+ " "+no3);
	}
	public static void main(String[] args) 
	{
		C obj = new C(10,20,30);
		
		obj.disp();
		
	}
}
