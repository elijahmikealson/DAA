package unit1;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		int t=0;
		for(int i=0;i<s.length();i++)
			if(Character.isDigit(s.charAt(i)))
				t+=Integer.parseInt(s.substring(i, i+1));
		System.out.println(t);
	}
}
