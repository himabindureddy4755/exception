
public class Throw1 {
	static void marks(int m1, int m2) 
	{
		int m3=m1+m2;
		if(m3>70)
		{
			System.out.println("pass");
		}
		else
		{
			throw new ArithmeticException("fail");
		}
	}
	public static void main(String[] args)  
	{
		marks(30,50);
		System.out.println("execution completed");
	}

}
