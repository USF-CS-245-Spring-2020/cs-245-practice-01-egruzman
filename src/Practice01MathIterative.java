/**
* Practice 01 Math Iterative
* Iterative functions for the Fibonacci sequence and for factorials
* @author Eli Gruzman
* 
*/

public class Practice01MathIterative implements Practice01Math
{
	public int fib (int n) throws Exception
	{
		if (n < 0)
			throw new Exception ("undefined");
		int sum = 0;
		int prevNum = -1;
		int nextNum = 1;
		for (int i = 0; i <= n; i++)
		{
			sum = prevNum + nextNum;
			prevNum = nextNum;
			nextNum = sum;
		}
		return sum;
	}


	public int fact (int n) throws Exception
	{
		if (n < 0)
			throw new Exception ("undefined");
		int f = 1;
		for(int i = 1; i <= n; i++)
			f = f*i;    
		return f;
	}
}