package oops.inhtopic.mli;

public class TestApp1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		TechEmployee t = new TechEmployee();
		
		t.scanData();
		t.dispData();
		
		System.out.println("Waiting : Thread.sleep(400000000):---");
		Thread.sleep(1000000);
		System.out.println("Finished :: Thread.sleep(400000000):---");

	}
}
