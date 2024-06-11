package Unit2;
import java.util.*;
class Item
{
	int id,p,w;
	double x;
	Item(int id,int p,int w)
	{
		this.id=id;
		this.p=p;
		this.w=w;
	}
}
public class GreedyKnapsack {
	static Item item[];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the no of items and capacity");
		int n=sc.nextInt(),m=sc.nextInt();
		item=new Item[n];
		greedyKnapsack(n,m);
		double sum=0;
		for(int i=0;item[i].x>0;i++)
			sum+=((double)item[i].p*item[i].x);
		System.out.print("Knapsack sequence :- ");
		for(int i=0;item[i].x>0;i++)
			System.out.print(item[i].id+" ");
		System.out.println("\nTotal profit value is "+sum);
	}
	static void greedyKnapsack(int n,int m)
	{
		System.out.println("Enter the profits and weights of each item");
		for(int i=0;i<n;i++)
			item[i]=new Item(i+1,sc.nextInt(),sc.nextInt());
		for(int i=0;i<n-1;i++)
			for(int j=0;j<n-i-1;j++)
				if(((double)item[j].p/item[j].w)<((double)item[j+1].p/item[j+1].w))
				{
					Item temp=item[j];
					item[j]=item[j+1];
					item[j+1]=temp;
				}
		int i;
		for(i=0;i<n;i++)
		{
			if(item[i].w>m)
				break;
			item[i].x=1;
			m-=item[i].w;
		}
		if(i<n&&m>0)
			item[i].x=(double)m/item[i].w;
	}
}