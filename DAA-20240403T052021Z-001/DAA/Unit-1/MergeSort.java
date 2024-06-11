package Recursion;
import java.util.*;
public class MergeSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.println("Elements before sorting :-");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		mergeSort(a,0,n-1);
		System.out.println("\nElements after sorting :- ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
	public static void mergeSort(int a[],int lb,int ub)
	{
		if(lb<ub)
		{
			int mid=(lb+ub)/2;
			mergeSort(a,lb,mid);
			mergeSort(a,mid+1,ub);
			merge(a,lb,mid,ub);
		}
	}
	public static void merge(int a[],int lb,int mid,int ub)
	{
		int n1=mid-lb+1,n2=ub-mid;
		int la[]=new int[n1];
		int ra[]=new int[n2];
		for(int i=0;i<n1;i++)
			la[i]=a[lb+i];
		for(int i=0;i<n2;i++)
			ra[i]=a[mid+1+i];
		int i=0,j=0,k=lb;
		while(i<n1&&j<n2)
		{
			if(la[i]<=ra[j])
				a[k++]=la[i++];
			else
				a[k++]=ra[j++];
		}
		while(i<n1)
			a[k++]=la[i++];
		while(j<n2)
			a[k++]=ra[j++];
	}
}