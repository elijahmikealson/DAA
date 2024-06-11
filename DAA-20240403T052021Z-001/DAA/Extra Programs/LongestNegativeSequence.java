package unit1;
import java.util.*;
public class LongestNegativeSequence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int a[]=new int[n+1];
		a[n]=0;
		System.out.println("Enter the numbers");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int seq=0,lseq=0;
		int lp=0,p=0,p2=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]<0&&lseq==0)
			{
				lp=i;
				lseq++;
			}
			else if(a[i]<0)
				lseq++;
			if(a[i+1]>=0)
			{
				if(seq==0)
				{
					seq=lseq;
					p=lp;lp=0;
				}
				if(lseq>seq)
				{
					p=lp;lp=0;
					seq=lseq;
					lseq=0;p2=0;
				}
				else if(lseq==seq)
				{
					p2=lp;lp=0;
					lseq=0;
				}
				else
					lseq=0;
			}
		}
		int sum=0;
		for(int i=0,j=p;i<seq;i++,j++)
			sum+=a[j];
		System.out.println("The longest negative sequence sum is "+sum);
		if(p2!=0)
		{	
			int s=0;
			for(int i=0,j=p2;i<seq;i++,j++)
				s+=a[j];
			System.out.println("The longest negative another sum is "+s);
		}
	}
}