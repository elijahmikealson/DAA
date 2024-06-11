package Recursion;
import java.util.*;
public class QuickSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements to sort");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
		System.out.println("Elements before Sorting :- ");
		for(int i=0;i<n;i++)
			System.out.print(a.get(i)+" ");
		quickSort(a,0,n-1);
		System.out.println("\nElements after Sorting :- ");
		for(int i=0;i<n;i++)
			System.out.print(a.get(i)+" ");
	}
	public static void quickSort(ArrayList<Integer> a,int lb,int ub)
	{
		if(lb<ub)
		{
			int i=lb+1,j=ub,pivot=a.get(lb);
			while(i<=j)
			{
				while(i<=ub&&a.get(i)<pivot)
					i++;
				while(j>=lb&&a.get(j)>pivot)
					j--;
				if(i<j)
				{
					int temp=a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
			a.set(lb,a.get(j));
			a.set(j,pivot);
			quickSort(a,lb,j-1);
			quickSort(a,j+1,ub);
		}
	}
}