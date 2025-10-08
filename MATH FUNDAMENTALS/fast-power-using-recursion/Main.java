/*
TOPIC: Math/Number Theory
PATTERN: Modular Exponentiation / Fast Power
PROBLEM: Fast Power using recursion
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
		long pow=power(a,b);
		System.out.println(pow);
	}
	public static long power(long a,long b){
	   if(b==0) return 1;
	   long half=power(a,b/2);
	   if(b%2==0){
	       return half*half;
	   }else{
	       return a*half*half;
	   }
	}
}
