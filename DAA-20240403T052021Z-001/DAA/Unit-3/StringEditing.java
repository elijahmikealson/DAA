package Exp1;
import java.util.*;
public class StringEditing {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings");
		String x=sc.next(),y=sc.next();
		System.out.println("The minimum cost to transform "+x+" into "+y+" is "+stringEditing(x,y));
	}
	public static int stringEditing(String x,String y)
	{
		int m=x.length(),n=y.length();
		int t[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
			for(int j=0;j<=n;j++)
			{
				if(i==0&&j==0)
					t[i][j]=0;
				else if(i==0)
					t[i][j]=t[i][j-1]+1;
				else if(j==0)
					t[i][j]=t[i-1][j]+1;
				else
				{
					if(x.charAt(i-1)==y.charAt(j-1))
						t[i][j]=t[i-1][j-1];
					else
						t[i][j]=Math.min(Math.min(t[i-1][j]+1,t[i][j-1]+1),t[i-1][j-1]+2);
				}
			}
		return t[m][n];
	}
}