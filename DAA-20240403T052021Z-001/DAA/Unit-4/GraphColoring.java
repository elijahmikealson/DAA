package unit4;
import java.util.*;
public class GraphColoring {
	static int x[],cost[][],m,n;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of vertices in the graph");
		n=sc.nextInt();
		x=new int[n+1];
		cost=new int[n+1][n+1];
		System.out.println("Enter the graph in form of adjacency matrix");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=sc.nextInt();
		System.out.println("Enter the max no of colors");
		m=sc.nextInt();
		graphColor(1);
	}
	static void graphColor(int k)
	{
		nextValueOf(k);
		if(x[k]==0)
			return;
		else if(k==n)
		{
			System.out.println("Colors of vertices are :-");
			for(int i=1;i<=n;i++)
				System.out.println("Vertex "+i+" : C"+x[i]);
		}
		else
			graphColor(k+1);
	}
	static void nextValueOf(int k)
	{
		while(true)
		{
			x[k]=(x[k]+1)%(m+1);
			if(x[k]==0)
				return;
			boolean b=true;
			for(int i=1;i<=n;i++)
				if(cost[k][i]!=0&&x[k]==x[i])
				{
					b=false;
					break;
				}
			if(b)
				return;
		}
	}
}
