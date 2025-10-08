/*
TOPIC: Math/Number Theory
PATTERN: Arithmetic Progression (Nth term, sum)
PROBLEM: sum of n terms
AUTHOR: Anisha
DATE: 08-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		int sum=n/2*(2*a+(n-1)*d);
		System.out.println(sum);
	}
}
