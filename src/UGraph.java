import java.util.ArrayList;


public class UGraph 
{
	private int n;
	private boolean[][] AdjMatrix;
	private byte[] ColorConnected;
	private byte[] ColorCyclic;
	
	public UGraph(int n) 
	{
		this.n = n;
		this.AdjMatrix = new boolean[n][n];
		this.ColorConnected = new byte[n];
		this.ColorCyclic = new byte[n];
	}

	//Add an edge to the Graph
	public void addEdge(int i, int j) 
	{
		this.AdjMatrix[i][j] = true;
		this.AdjMatrix[j][i] = true;
	}
	
	//To check if the undirected graph is connected
	public boolean isConnected()
	{
		int vertexIndex = 0;
		ColorConnected[vertexIndex] = 1; 
        ArrayList<Integer> Q = new ArrayList<Integer>();
        Q.add(vertexIndex);
        int count = 0;
        while(Q.size() != 0)
        {
        	vertexIndex = Q.remove(0);
        	for (int i = 0; i < n ; i++) 
        	{
        		if(AdjMatrix[vertexIndex][i])
        		{
        			if(ColorConnected[i] == 0)
        			{
        				ColorConnected[i] = 1;
        				Q.add(i);
        			}
        		}
        	}
        	ColorConnected[vertexIndex] = 2;
        	count++;
        }
        if(count == AdjMatrix[0].length)
        {
        	return true;
        }
        else
        {
        	return false;
        }
	}

	//To check if the undirected graph contains any cycle
	public boolean isCyclic()
	{
		for (int i = 0; i < n ; i++) 
    	{
			if(ColorCyclic[i] == 0)
			{
				if(BFSVistCyclic(i))
				{
					return true;
				}
			}
    	}
		return false;
	}
	
	//Run BFS on Graph to check for Cyclicity
	private boolean BFSVistCyclic(int vertexIndex)
	{
		ColorCyclic[vertexIndex] = 1;
        ArrayList<Integer> Q = new ArrayList<Integer>();
        Q.add(vertexIndex);
        while(Q.size() != 0)
        {
        	vertexIndex = Q.remove(0);
        	for (int i = 0; i < n ; i++) 
        	{
        		if(AdjMatrix[vertexIndex][i])
        		{
        			if(ColorCyclic[i] == 1)
        			{
        				return true;
        			}
        			else if(ColorCyclic[i] == 0)
        			{
        				ColorCyclic[i] = 1;
        				Q.add(i);
        			}
        		}
        	}
        	ColorCyclic[vertexIndex] = 2;
        }
        return false;
	}
}
