package Exp1;
import java.util.*;
public class NQueens {
	static int x[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of Queens");
		int n=sc.nextInt();
		x=new int[n+1];
		if(n==2||n==3)
			System.out.println("Not Possible!");
		else
			nQueens(1,n);
	}
	static void nQueens(int k,int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(place(k,i))
			{
				x[k]=i;
				if(k==n)
				{
					System.out.print("The Positions are :- ");
					for(int j=1;j<=n;j++)
						System.out.print(x[j]+" ");
					System.out.println();
					for(int j=1;j<=n;j++)
					{	for(int l=1;l<=n;l++)
							if(x[j]==l)
								System.out.print("Q");
							else
								System.out.print(" - ");
						System.out.println();
					}
				}
				else
					nQueens(k+1,n);
			}
		}
	}
	static boolean place(int k,int i)
	{
		for(int j=1;j<=k-1;j++)
		{
			if(x[j]==i)
				return false;
			else if(Math.abs(x[j]-i)==Math.abs(j-k))
				return false;
		}
		return true;
	}
}