/*
TOPIC: Math/Number Theory
PATTERN: Logarithms / Exponents / Power Checks
PROBLEM: Count number of digits in a^n
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long n=sc.nextInt();
		double digits=n*Math.log10(a);
		long count=(long)Math.floor(digits)+1;
		System.out.print(count);
	}
}
