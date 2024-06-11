package Unit2;
import java.util.*;
public class Prims {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of vertices");
		int nv=sc.nextInt();
		System.out.println("Enter the Graph in matrix form");
		int cost[][]=new int[nv+1][nv+1];
		for(int i=1;i<=nv;i++)
			for(int j=1;j<=nv;j++)
			{
				cost[i][j]=sc.nextInt();
				if(i==j)
					cost[i][j]=999;
			}
		int v[]=new int[nv+1];		
		int e=1,c=0;
		int min=999,a=0,b=0;
		for(int i=1;i<=nv;i++)
		{
			if(e==nv)
				break;
			for(int j=1;j<=nv;j++)
			{
				if(min>cost[i][j]&&cost[i][j]!=0)
				{
					min=cost[i][j];
					a=i;b=j;
				}
			}
			if(v[a]==0||v[b]==0)
			{
				v[a]=v[b]=1;
				System.out.println(e+". "+a+"->"+b+" Weight : "+min);
				e++;c+=min;
				min=999;
			}
		}		
		System.out.println("The cost is "+c);
	}
}
/*
999	5	7	0
5	999	6	3
7	6	999	8
0	7	8	999

*/