package source.java;
import java.util.*;
public class BFS {
	static int cost[][];
	static boolean v[];
	static ArrayDeque<Integer> a=new ArrayDeque<Integer>();
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
		System.out.println("Enter the source vertex");
		int s=sc.nextInt();
		System.out.print("The BFS Sequence is :- ");
		for(int i=1;i<=n;i++)
		bfs(i);
	}
	static void bfs(int n)
	{
		if(!v[n])
		{
			v[n]=true;
			System.out.print(n+" ");
			for(int i=1;i<cost.length;i++)
				if(cost[n][i]!=0&&!v[i])
					a.add(i);
			if(!a.isEmpty())
				bfs(a.removeFirst());
		}
	}
}
