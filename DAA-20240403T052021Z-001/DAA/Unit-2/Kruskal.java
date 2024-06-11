package DAA;
import java.util.*;
class Edge
{
	int v1,v2,wt;
	Edge(int v1,int v2,int wt)
	{
		this.v1=v1;
		this.v2=v2;
		this.wt=wt;
	}
}
public class Kruskal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of vertices and no of edges in the graph");
		int nv=sc.nextInt(),ne=sc.nextInt();
		Edge e[]=new Edge[ne+1];
		System.out.println("Enter vertices and weights of each edge");
		for(int i=1;i<=ne;i++)
			e[i]=new Edge(sc.nextInt(),sc.nextInt(),sc.nextInt());
		for(int i=1;i<ne;i++)
			for(int j=1;j<ne-i;j++)
				if(e[j].wt>e[j+1].wt)
				{
					Edge t=e[j];
					e[j]=e[j+1];
					e[j+1]=t;
				}
		System.out.println("The edges for minimun cost spanning tree are :-");
		kruskal(e,nv);
	}
	public static void kruskal(Edge e[],int nv)
	{
		int v[]=new int[nv+1];
		int count=1,cost=0;
		for(int i=1;i<=e.length;i++)
		{
			if(count==nv)
				break;
			if(v[e[i].v1]==0||v[e[i].v2]==0)
			{
				v[e[i].v1]=v[e[i].v2]=1;
				System.out.println(e[i].v1+"->"+e[i].v2);
				cost+=e[i].wt;
				count++;
			}
		}
		System.out.println("The cost is "+cost);
	}
}