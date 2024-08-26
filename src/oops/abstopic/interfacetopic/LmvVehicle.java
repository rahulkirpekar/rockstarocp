package oops.abstopic.interfacetopic;

public class LmvVehicle implements Vehicle
{
	@Override
	public void getSpec() 
	{
		System.out.println("LmvVehicle : getSpec()");
	}
	public void getLMVInfo() 
	{
		System.out.println("LmvVehicle : getLMVInfo()");
	}
}
