package oops.abstopic.interfacetopic;

public class HmvVehicle implements Vehicle
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
