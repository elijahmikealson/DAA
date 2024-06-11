package unit1;
import java.util.*;
public class Pattern1Pyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int s=n;
		for(int i=0;i<n;i++)
		{
			for(int k=--s;k>0;k--)
				System.out.print(" ");
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
				if(j<i)
					System.out.print("A");
			}
			System.out.println();
		}
	}
}
