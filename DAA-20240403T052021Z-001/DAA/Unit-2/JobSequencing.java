package Unit2;
import java.util.*;
class Job
{
    int id,time,profit;
    Job(int id,int profit,int time)
    {
        this.id=id;
        this.profit=profit;
        this.time=time;
    }
}
public class JobSequencing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total no of Jobs");
        int n=sc.nextInt();
        Job j[]=new Job[n];
        System.out.println("Enter the profit and deadline of each job");
        for(int i=0;i<n;i++)
            j[i]=new Job(i+1,sc.nextInt(),sc.nextInt());
        jobSequence(j);
    }
    public static void jobSequence(Job j[])
    {
        int dmax=0;
        for(int i=0;i<j.length;i++)
            if(j[i].time>dmax)
                dmax=j[i].time;
        int d[][]=new int[dmax+1][2];
        for(int i=0;i<j.length-1;i++)
            for(int k=0;k<j.length-i-1;k++)
                if(j[k].profit<j[k+1].profit)
                {
                    Job p=j[k];
                    j[k]=j[k+1];
                    j[k+1]=p;
                }
        for(int i=0;i<j.length;i++)
        {
            int k=j[i].time;
            while(k>=1)
            {
                if(d[k][0]==0)
                {
                    d[k][0]=j[i].id;
                    d[k][1]=j[i].profit;
                    break;
                }
                k--;
            }
        }
        System.out.print("The Job Sequence :- ");
        int pmax=0;
        for(int i=1;i<d.length;i++)
        	if(d[i][0]!=0)
        	{
        		System.out.print(d[i][0]+" ");
        		pmax+=d[i][1];
        	}
        System.out.println("\nMax Profit is "+pmax);
    }
}
/*
200	5
180	3
190	3
300	2
120	4
100	2
*/