package Factorial;

// Hallar el factorial de un numero

public class HallarFactorial
{
	public double factorial(int n)
	{
		double resultado;
		for(resultado = 1; n >1; n--)
		{
			resultado *= n;
		}
		return resultado;
	}
	
	public static void main(String args[])
	{
		HallarFactorial factor = new HallarFactorial();
		double x = factor.factorial(9);
		System.out.println(+x);
	}

}
