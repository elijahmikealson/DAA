package unit1;
import java.util.*;
/*
 Sample Input:INDIA
 O/P:-
 I
 IN
 IND
 INDI
 INDIA
 */
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(s.charAt(j));
			System.out.println();
		}
	}

}
