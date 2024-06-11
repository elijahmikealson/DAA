package unit4;
import java.util.*;
public class HamiltonianCycle {
	static int x[],cost[][],n;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		n=sc.nextInt();
		x=new int[n+1];
		cost=new int[n+1][n+1];
		System.out.println("Enter the adjacency matrix of the graph");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=sc.nextInt();
		x[1]=1;
		hamiltonian(2);
	}
	static void hamiltonian(int k)
	{
		while(true)
		{
			nextValueOf(k);
			if(x[k]==0)
				return;
			else if(k==n)
			{
				System.out.print("The Hamiltonian Path :- ");
				for(int j=1;j<=n;j++)
					System.out.print(x[j]+"->");
				System.out.println(1);
			}
			else
				hamiltonian(k+1);
		}
	}
	static void nextValueOf(int k)
	{
		while(true)
		{
			x[k]=(x[k]+1)%(n+1);
			if(x[k]==0)
				return;
			if(cost[x[k-1]][x[k]]!=0)
			{
				boolean b=true;
				for(int j=1;j<=k-1;j++)
					if(x[j]==x[k])
					{
						b=false;
						break;
					}
				if(b)
					if(k<n||cost[x[n]][1]!=0)
						return;
			}
		}
	}
}