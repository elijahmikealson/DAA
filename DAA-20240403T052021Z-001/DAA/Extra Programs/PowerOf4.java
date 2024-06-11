package unit1;
import java.util.*;
public class PowerOf4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is power of 4 or not");
		int n=sc.nextInt();
		while(n>4)
			n/=4;
		if(n==4)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
