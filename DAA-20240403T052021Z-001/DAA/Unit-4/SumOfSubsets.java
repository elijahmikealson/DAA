package Exp1;
import java.util.*;
public class SumOfSubsets {
	static int a[],x[],m,n; 
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no.of elements of an aray : ");
		n=sc.nextInt();
		int sum=0;
		System.out.println("Enter elements of array : ");
		 a=new int[n+1];
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		System.out.println("Enter k value : ");
			m=sc.nextInt();
		x=new int[n+1];
		Arrays.sort(a);
		sumofsubsets(0,1,sum);
	}
	static void sumofsubsets(int s,int k,int r)
	{
		x[k]=1;
		if(s+a[k]==m)
		{
			for(int i=1;i<=k;i++)
				if(x[i]!=0)
					System.out.print(a[i]+" ");
			System.out.println();
		}
		else if(s+a[k]+a[k+1]<=m)
			sumofsubsets(s+a[k],k+1,r-a[k]);
		if(s+r-a[k]>=m&&s+a[k+1]<=m)
		{
			x[k]=0;
			sumofsubsets(s,k+1,r-a[k]);
		}
	}
}