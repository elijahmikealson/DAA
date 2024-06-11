/*
 Pattern :
 bbbb*
 bbb**
 bb***
 b****
 *****
 */
package unit1;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
				if(i<j)
					System.out.print("b");
				else
					System.out.print("*");
			System.out.println();
		}
	}
}
