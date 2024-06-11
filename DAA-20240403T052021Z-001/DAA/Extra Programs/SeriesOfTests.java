package unit1;
import java.util.*;
public class SeriesOfTests {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of days");
		int n=sc.nextInt();
		System.out.println("Enter the marks");
		int t=0;
		for(int i=0;i<n;i++)
		{	int x=sc.nextInt();
			if(x>0)
				System.out.println(t+=x);
			else
			{
				System.out.println("Invalid Input");
				break;
			}
		}
	}
}
