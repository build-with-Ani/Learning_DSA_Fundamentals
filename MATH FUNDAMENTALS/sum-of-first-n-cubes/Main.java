/*
TOPIC: Math/Number Theory
PATTERN: Sum of N Natural Numbers / Squares / Cubes
PROBLEM: Sum of first N cubes
AUTHOR: Anisha
DATE: 09-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		long wh=(n*(n+1))/2;
		long sum=power(wh,2);
		System.out.println(sum);
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
