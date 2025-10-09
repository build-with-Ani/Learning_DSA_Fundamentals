/*
TOPIC: Math/Number Theory
PATTERN: Sum of N Natural Numbers / Squares / Cubes
PROBLEM: Sum of first N squares
AUTHOR: Anisha
DATE: 09-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=(n*(n+1)*((2*n)+1))/6;
		System.out.println(sum);
	}
}
