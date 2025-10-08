/*
TOPIC: Math/Number Theory
PATTERN: Arithmetic Progression (Nth term, sum)
PROBLEM: Find the sum of terms between Mth and Nth term
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
		int m=sc.nextInt();
		int n=sc.nextInt();
		long nsum=(long)n*(2*a+(n-1)*d)/2;
		long msum=(long)(m-1)*(2*a+(m-2)*d)/2;
		long sum=nsum-msum;
		System.out.println(sum);
	}
}
