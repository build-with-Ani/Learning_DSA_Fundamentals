/*
TOPIC: Math/Number Theory
PATTERN: Bitwise Operations (set/unset/count bits, XOR tricks, subset generation)
PROBLEM: Find the number that appears once in an array where all others appear twice
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		} 
		int num=0;
		for(int i=0;i<n;i++){
		    num=num^arr[i];
		}
		System.out.print(num);
	}
}
