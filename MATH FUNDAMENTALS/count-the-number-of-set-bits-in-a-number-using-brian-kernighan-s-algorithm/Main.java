/*
TOPIC: Math/Number Theory
PATTERN: Bitwise Operations (set/unset/count bits, XOR tricks, subset generation)
PROBLEM: Count the number of set bits in a number using Brian Kernighan’s Algorithm
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n!=0){
		    n=n & (n-1);
		    count++;
		}
		System.out.print(count);
	}
}
