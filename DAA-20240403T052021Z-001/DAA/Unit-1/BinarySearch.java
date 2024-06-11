package Recursion;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		System.out.println("Enter the sorted elements");
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			a.add(sc.nextInt());
		System.out.println("Enter the key element to search");
		int key=sc.nextInt();
		int p=-1;
		p=binarySearch(a,key,0,n-1);
		if(p==-1)
			System.out.println("Sorry, "+key+" not found in the given elements");
		else
			System.out.println(key+" found at the position "+(p+1));
	}
	public static int binarySearch(ArrayList<Integer> a,int key,int lb,int ub)
	{
		while(lb<=ub)
		{
			int mid=(lb+ub)/2;
			if(a.get(mid)==key)
				return mid;
			else if(a.get(mid)>key)
				return binarySearch(a,key,lb,mid-1);
			else if(a.get(mid)<key)
				return binarySearch(a,key,mid+1,ub);
		}
		return -1;
	}
}