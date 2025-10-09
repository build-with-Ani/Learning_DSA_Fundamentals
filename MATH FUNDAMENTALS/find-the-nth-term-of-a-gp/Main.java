/*
TOPIC: Math/Number Theory
PATTERN: Geometric Progression (Nth term, sum)
PROBLEM: Find the Nth term of a GP
AUTHOR: Anisha
DATE: 09-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		long pow=power(r,n-1);
		long nth=(long)a*pow;
		System.out.println(nth);
	}
	public static long power(int a,int b){
	    if(b==0) return 1;
	    long half=power(a,b/2);
	    if(b%2==0){
	        return half*half;
	    }else{
	        return a*half*half;
	    }
	}
}
