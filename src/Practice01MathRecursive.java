/**
* Practice 01 Math Recursive
* Recursive functions for the Fibonacci sequence and for factorials
* @author Eli Gruzman
* 
*/

public class Practice01MathRecursive implements Practice01Math
{
	public int fib (int n) throws Exception
	{
		int f = 0;
		if (n < 0)
			throw new Exception ("undefined");
		else if (n == 0)
			return 0;
		else if (n <= 1)
			return 1;
		return fib(n-1) + fib(n-2);
	}

	public int fact (int n) throws Exception
	{
		if (n < 0)
			throw new Exception ("undefined");
		else if (n <= 1)
			return 1;
		else
			return (n*fact(n-1));
	}
}