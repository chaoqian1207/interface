
public class demoInterface 
{
	public static void main(String[] args) 
	{
		myInterface1 mya = new myInterface1()
		{
			public int fun1(int t) 
			{
				return 0;
			}

			public void fun2(int a, int b) 
			{
			}
		};
		mya.fun1(10);
		mya.fun2(10, 20);
	
	}
}
