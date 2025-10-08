/*
TOPIC: Math/Number Theory
PATTERN: Modular Exponentiation / Fast Power
PROBLEM: “Super Pow” (LeetCode 372) → modular exponentiation
AUTHOR: Anisha
DATE: 07-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		long mod=sc.nextLong();
		long pow=power(a,b,mod);
		System.out.println(pow);
	}
	public static long power(int a,int b,long mod){
	    if(b==0)return 1;
	    long half=power(a,b/2,mod);
	    if(b%2==0) return (half*half)%mod;
	    else return (a*half%mod*half%mod)%mod;
	}
}
