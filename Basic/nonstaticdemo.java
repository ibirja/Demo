class C 
{
	int j=2;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		C benz=new C();
		System.out.println(benz.j);
		benz.j=20;
		System.out.println(benz.j);
	}
}
