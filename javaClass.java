package javatestpackage;

public class javaClass 
{
	int num = 0;
	
	public void sampleMethod() {}

	public static void main(String...args) 
	{
		Calculator calculator1 = new Calculator(5);
		Calculator calculator2 = new Calculator(150);

		//syso + ctrl espacio
		System.out.println("Created 2 calculators");
		System.out.println("---------------------");

		int calc1ResultSum 		= calculator1.sum(4, 5);
		int calc1ResultFactor 	= calculator1.factor(3);
		System.out.println("sumresult1		" + calc1ResultSum);
		System.out.println("factorresult1	" + calc1ResultFactor);
		
		int calc2ResultSum 		= calculator2.sum(4, 5);
		int calc2ResultFactor 	= calculator2.factor(3);
		System.out.println("sumresult2		" + calc2ResultSum);
		System.out.println("factorresult2	" + calc2ResultFactor);
		
		System.out.println("Hello World");
	}
	
}

class Calculator 
{
	private int fact;
	
	public Calculator(int factor)
	{
		this.fact = factor;
	}
	
	public int sum(int a, int b)
	{
		return a+b;
	}

	public int factor(int x)
	{
		int result = 1;
		for(int i = 0; i < fact; ++i) 
		{
			result *= x;
		}
		return result;
	}
}

