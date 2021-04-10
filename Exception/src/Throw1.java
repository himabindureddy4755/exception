
public class Throw1 {
	static void marks(int m1, int m2) throws Exception
	{
		int m3=m1+m2;
		if(m3>70)
		{
			System.out.println("pass");
		}
		else
		{
			throw new Exception("fail");
		}
	}
	public static void main(String[] args) throws Exception
	{
		marks(30,50);
		System.out.println("execution completed");
	}

}
