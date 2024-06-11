package unit1;
import java.util.*;
public class SkillCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the values");
		int i;
		for(i=0;i<n;i++)
		{
			int s=sc.nextInt();
			if(s<=6&&s>=1)
				switch(s)
				{
					case 1:a[0]++;break;
					case 2:a[1]++;break;
					case 3:a[2]++;break;
					case 4:a[3]++;break;
					case 5:a[4]++;break;
					case 6:a[5]++;break;
				}
			else
			{
				System.out.println("Invalid Input");
				break;
			}
		}
		if(i==n)
			System.out.println("Aptitide Count : "+a[0]+"\nVerbal Count : "+a[1]+"\nLogical Reasoning Count : "+a[2]+"\nDebugging Count : "+a[3]+"\nTechnical Count : "+a[4]+"\nProgramming Count : "+a[5]);
	}
}
