/*
TOPIC: Math/Number Theory
PATTERN: Bitwise Operations (set/unset/count bits, XOR tricks, subset generation)
PROBLEM: Set the k-th bit of a number
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
		int num= n|(1<<k);
		System.out.print(num);
	}
}
