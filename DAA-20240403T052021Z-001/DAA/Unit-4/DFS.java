package Exp1;
import java.util.*;
public class DFS {
	static int cost[][];
	static boolean v[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of vertices in the Graph");
		int n=sc.nextInt();
		cost=new int[n+1][n+1];
		v=new boolean[n+1];
		System.out.println("Enter the adjacency matrix of the Graph");
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++)
				cost[i][j]=sc.nextInt();
		System.out.print("The DFS sequence is :- ");
		dfs(1);
	}
	static void dfs(int n)
	{
		if(!v[n])
		{
			v[n]=true;
			System.out.print(n+" ");
			for(int i=1;i<cost.length;i++)
				if(cost[n][i]!=0&&!v[i])
					dfs(i);		
		}
	}
}
