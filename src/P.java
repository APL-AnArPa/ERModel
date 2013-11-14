
public abstract class P
{
	public abstract double func(int n);
}

class P1 extends P 
{
	public double func(int n) 
	{
		return ( 1/ (double) n );
	}

}

class P2 extends P 
{
	public double func(int n) 
	{
		return ( 1/ (double) (n*n) );
	}

}

class P3 extends P 
{
	public double func(int n) 
	{
		return ( 1/ Math.sqrt(n) );
	}

}

class P4 extends P 
{
	public double func(int n) 
	{
		return 	Math.log( (double)n )/Math.log(2)/n;
	}

}

class P5 extends P 
{
	public double func(int n) 
	{
		return 	Math.log( (double)n )/Math.log(2)/(n*n);
	}

}

class P6 extends P 
{
	public double func(int n) 
	{
		return (Math.log( (double)n )/Math.log(2))*(Math.log( (double)n )/Math.log(2))/n;
	}

}
