/*
TOPIC: Math/Number Theory
PATTERN: Logarithms / Exponents / Power Checks
PROBLEM: Compute aⁿ using Fast Exponentiation (Divide and Conquer)
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
		long pow=power(a,n);
		System.out.print(pow);
	}
	public static long power(long a,long n){
	    if(n==0) return 1;
	    long half=power(a,n/2);
	    if(n%2==0){
	        return half*half;
	    }else{
	        return a*half*half;
	    }
	}
}
