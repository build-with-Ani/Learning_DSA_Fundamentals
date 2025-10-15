/*
TOPIC: Math/Number Theory
PATTERN: Logarithms / Exponents / Power Checks
PROBLEM: Compare 2 power without calculating problem
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		long d=sc.nextInt();
		double ab=b*Math.log10(a);
	    double cd=d*Math.log10(c);
	    if(ab>cd){
	        System.out.print("a^b is greater");
	    }else if(ab<cd){
	        System.out.print("c^d is greater");
	    }else{
	        System.out.print("Both are equal");
	    }
	}
}
