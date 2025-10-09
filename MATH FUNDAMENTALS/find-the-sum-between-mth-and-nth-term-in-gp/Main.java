/*
TOPIC: Math/Number Theory
PATTERN: Geometric Progression (Nth term, sum)
PROBLEM: Find the sum between Mth and Nth term
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
		long m=sc.nextInt();
		long n=sc.nextInt();
	    if(r==1){
            System.out.println(a*(n-m+1));
        }else{
    		long npow=power(r,n);
    		long mpow=power(r,m-1);
    		long nsum=a*(npow-1)/(r-1);
    		long msum=a*(mpow-1)/(r-1);
    		System.out.println(nsum-msum);
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
