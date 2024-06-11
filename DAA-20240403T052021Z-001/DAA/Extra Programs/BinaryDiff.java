package unit1;
import java.util.*;
public class BinaryDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers to find the no of different bits in their binary form");
		System.out.println(Integer.bitCount(sc.nextInt()^sc.nextInt()));
	}
}
