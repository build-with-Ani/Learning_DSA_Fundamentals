/*
TOPIC: Math/Number Theory
PATTERN: Factorials
PROBLEM: Factorials (with modulo)
AUTHOR: Anisha
DATE: 07-10-2025
*/
import java.util.*;
public class Main
{
    final static long mod=100000007;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(factorial(n));
	}
	public static long factorial(int n){
	    long fact=1;
	    for(int i=2;i<=n;i++){
	        fact=(fact*i)%mod;
	    }
	    return fact;
	}
}
