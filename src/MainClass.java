import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class MainClass {

	public static void main(String[] args) 
	{
		try 
		{
			//Connectedness check for p(n)=c(log n)/n
			String filename = "Connectedness1.txt";
			PrintWriter out = new PrintWriter(filename);
			RandGraph RG = new RandGraph();
			int intervals = 10;
			double startValue = 0.3;
			double endValue = 1.6;
			double increments = (endValue - startValue)/intervals;
			out.println("c\tProbability");
			for(int i = 0; i <= intervals; i ++)
			{
				out.println(startValue + i*increments + "\t" + RG.probability(true, new P4(), startValue + i*increments));
			}
			out.close();
			
			//Connectedness check for p(n)=c(log n)/n^2
			filename = "Connectedness2.txt";
			out = new PrintWriter(filename);
			out.println("c\tProbability");
			startValue = 100;
			endValue = 1500;
			increments = (endValue - startValue)/intervals;
			for(int i = 0; i <= intervals; i ++)
			{
				out.println(startValue + i*increments + "\t" + RG.probability(true, new P5(), startValue + i*increments));
			}
			out.close();
			
			//Connectedness check for p(n)=c(log n)^2/n
			filename = "Connectedness3.txt";
			out = new PrintWriter(filename);
			out.println("c\tProbability");
			startValue = 0.01;
			endValue = 0.2;
			increments = (endValue - startValue)/intervals;
			for(int i = 0; i <= intervals; i ++)
			{
				out.println(startValue + i*increments + "\t" + RG.probability(true, new P6(), startValue + i*increments));
			}
			out.close();

			//Cyclicity check for p(n)=c/n
			filename = "Cyclicity1.txt";
			out = new PrintWriter(filename);
			out.println("c\tProbability");
			startValue = 0.1;
			endValue = 2;
			increments = (endValue - startValue)/intervals;
			for(int i = 0; i <= intervals; i ++)
			{
				out.println(startValue + i*increments + "\t" + RG.probability(false, new P1(), startValue + i*increments));
			}
			out.close();
			
			//Cyclicity check for p(n)=c/n^2
			filename = "Cyclicity2.txt";
			out = new PrintWriter(filename);
			out.println("c\tProbability");
			startValue = 100;
			endValue = 1500;
			increments = (endValue - startValue)/intervals;
			for(int i = 0; i <= intervals; i ++)
			{
				out.println(startValue + i*increments + "\t" + RG.probability(false, new P2(), startValue + i*increments));
			}
			out.close();

			//Cyclicity check for p(n)=c/sqrt(n)
			filename = "Cyclicity3.txt";
			out = new PrintWriter(filename);
			out.println("c\tProbability");
			startValue = 0.005;
			endValue = 0.08;
			increments = (endValue - startValue)/intervals;
			for(int i = 0; i <= intervals; i ++)
			{
				out.println(startValue + i*increments + "\t" + RG.probability(false, new P3(), startValue + i*increments));
			}
			out.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
