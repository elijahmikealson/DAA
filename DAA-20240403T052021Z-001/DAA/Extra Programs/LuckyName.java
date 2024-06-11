package unit1;
import java.util.*;
public class LuckyName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		String s=sc.next();
		int i;
		for(i=0;i<s.length();i++)
			if(s.indexOf(s.substring(i,i+1))==s.lastIndexOf(s.substring(i,i+1)))
			{
				System.out.println(s.substring(i,i+1));
				break;
			}
		if(i==s.length())
			System.out.println("#");
	}
}
