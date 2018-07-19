class C
{
	public static void m1() 
	{
		System.out.println("Executing the m1 of class C");
	}
}
class D
{
	public static void main(String [] arg)

	{
		System.out.println("excecution starts");
		C.m1();
		System.out.println("excecution ends");
	}
}