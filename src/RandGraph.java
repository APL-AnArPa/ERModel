import java.util.Random;


public class RandGraph 
{
	public double probability(boolean isConnectedness, P p, double c)
	{
		int count = 0;
		Random randgen = new Random();
		for(int g = 0; g < 1000; g++)
		{
			//Create a random graph with n vertices
			int n = randgen.nextInt(500) + 500;
			UGraph G = new UGraph(n);
			
			//Add each edge with probability c*p.func(n)
			for(int i = 0; i < n; i++)
			{
				for(int j = i+1; j < n; j++)
				{
					if(randgen.nextDouble() <= c*p.func(n))
					{
						G.addEdge(i, j);
					}
				}
			}
			if(isConnectedness)
			{	
				if(G.isConnected())
				{
					count++;
				}
			}
			else
			{
				if(G.isCyclic())
				{
					count++;
				}
			}
		}
		
		return (double)count/1000;
	}
}
