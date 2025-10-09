/*
TOPIC: Math/Number Theory
PATTERN: Geometric Progression (Nth term, sum)
PROBLEM: Find the sum of first N terms
AUTHOR: Anisha
DATE: 09-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt();
		long r=sc.nextInt();
		long n=sc.nextInt();
		if(r==1){
		    System.out.println(a*n);
		}else{
    		long pow=power(r,n);
    		long num=pow-1;
    		long den=r-1;
    		long sum=a*(num/den);
    		System.out.println(sum);
		}
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
