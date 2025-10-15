/*
TOPIC: Math/Number Theory
PATTERN: Bitwise Operations (set/unset/count bits, XOR tricks, subset generation)
PROBLEM: Check if k-th bit is set
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Boolean isSet=(n & (1<<k)) !=0;
		if(isSet) System.out.print("It is set");
		else System.out.print("It is not a set");
	}
}
