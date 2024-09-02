package stringtopic;

public class TestApp3 
{
	public static void main(String[] args) 
	{
//		String name1 ="royal";
//		String name2 ="techno";
//		System.out.println(name1 +" --- " + name1.hashCode());
//		name1 = name1.concat(name2);
//		System.out.println(name1 +" --- " + name1.hashCode());
		
		
		StringBuilder sb = new StringBuilder("royal");
		
		System.out.println(sb+"---"+sb.hashCode());
		
		sb.append(" techno");
		
		System.out.println(sb+"---"+sb.hashCode());
	}
}
