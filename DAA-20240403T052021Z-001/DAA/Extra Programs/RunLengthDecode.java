package unit1;
import java.util.*;
public class RunLengthDecode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		for(int i=0;i<s.length();i+=2)
			for(int j=0;j<Integer.parseInt(s.substring(i+1,i+2));j++)
				System.out.print(s.substring(i,i+1));
	}
}
