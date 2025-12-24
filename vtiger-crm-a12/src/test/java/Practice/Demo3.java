package Practice;

public class Demo3 {
	Demo3()
	{
		System.out.println("1");
	}
	Demo3(int a)
	{
		System.out.println("2");
		
	}
	Demo3(int a, String s)
	{
		System.out.println("3");
	}

	public static void main(String[] args) 
	{
		Demo3 a = new Demo3();
		Demo3 b = new Demo3(5);
		Demo3 c = new Demo3(5,"s");

	}

}
