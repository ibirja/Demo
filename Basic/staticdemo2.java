class B 
{
	static  int i=1;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(B.i);
		m1();
		System.out.println(B.i);
		System.out.println("main ends");
	}
	public static void m1()
	{
		B.i=10;
	}
}
