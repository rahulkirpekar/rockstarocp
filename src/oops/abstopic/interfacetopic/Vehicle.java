package oops.abstopic.interfacetopic;

public abstract interface Vehicle 
{
	// 1) Dm's---[public static final]---constant variables
	
	int no = 10;//// JVM---Runtime---[public static final]	

	
// 		2) Mf's
	
//		1) Abstract Methods---[public abstract]
	public void getSpec();//abstract	


//		void test1();// JVM---Runtime---[public abstract]

//		2) NonAbstract Methods
//			1)static Method[Java V8]---[Vehicle.test2();]
			static void test2()
			{

			}	
			
//			2) default Method[Java V8]---[child object--->obj.test2()]
			default void test3()
			{
				test4();
//				other code;
				test4();
				test4();
//				other code;
				test4();
//				other code;
				test4();
//				other code;
			}
			
//			3) private Method[Java V9]
			private void test4()
			{

			}
}
