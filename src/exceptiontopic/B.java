package exceptiontopic;

import java.io.IOException;

public class B extends A
{
	@Override
	void test() throws IOException
	{
		
	}
}
//if parent's overriden method not define any exceptoin

// 1) child define Unchecked only
// 2) can't defiine check exception in child's overriden method
----------------------------------
// if parent's overriden method define  any exceptoin
// 1) same exception
// 2) NO exception
// 3) child exception
// 4) can't define parent exception'
