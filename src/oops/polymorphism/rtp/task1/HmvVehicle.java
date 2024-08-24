package oops.polymorphism.rtp.task1;

public class HmvVehicle extends Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("HmvVehicle : getSpec()");
	}
	public void getHMVInfo() 
	{
		System.out.println("HmvVehicle : getHMVInfo()");
	}
}
