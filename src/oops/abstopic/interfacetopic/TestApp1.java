package oops.abstopic.interfacetopic;

import java.util.Scanner;

public class TestApp1 
{
	public void getVehicleInfo(Vehicle vehicle) 
	{
		//Upcasting
		vehicle.getSpec();
		
		if(vehicle instanceof TwVehicle) 
		{
			// Downcasting
			TwVehicle tw = (TwVehicle)vehicle;
			tw.getTWInfo();

		}else if(vehicle instanceof LmvVehicle) 
		{
			// Downcasting
			LmvVehicle lmv = (LmvVehicle)vehicle;
			lmv.getLMVInfo();
		}
		else if(vehicle instanceof HmvVehicle) 
		{
			// Downcasting
			HmvVehicle hmv = (HmvVehicle)vehicle;
			hmv.getHMVInfo();
		}
	}
//	public void getVehicleInfo(LmvVehicle lmv) 
//	{
//		lmv.getSpec();
//	}
//	public void getVehicleInfo(HmvVehicle hmv) 
//	{
//		hmv.getSpec();
//	}
	
	
	public static void main(String[] args) 
	{
//		Student s= new Studnet();
//	--------------------------------------	
//		Student s= null;
//		s = new Studnet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter below Vehicles : ");
		System.out.println("1) For TwVehicle");
		System.out.println("2) For LmvVehicle");
		System.out.println("3) For HmvVehicle");
		int choice = sc.nextInt();
		
//		Vehicle vehicle = null;
		TestApp1 t = new  TestApp1();
				
		switch(choice)
		{
			case 1: TwVehicle tw = new TwVehicle();
//					tw.test3();
//					Vehicle.test2();
//					tw.test4();
					
//					vehicle.getSpec();
					
					t.getVehicleInfo(tw);
					break;
					
			case 2: LmvVehicle lmv = new LmvVehicle();
//					lmv.getSpec();
					
					t.getVehicleInfo(lmv);
					break;
					
			case 3: HmvVehicle hmv = new HmvVehicle();
//					hmv.getSpec();
			
					t.getVehicleInfo(hmv);
					break;
		}
	}
}