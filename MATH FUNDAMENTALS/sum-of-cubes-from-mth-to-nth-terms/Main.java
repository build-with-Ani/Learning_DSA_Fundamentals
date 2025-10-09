/*
TOPIC: Math/Number Theory
PATTERN: Sum of N Natural Numbers / Squares / Cubes
PROBLEM: Sum of cubes from Mth to Nth terms
AUTHOR: Anisha
DATE: 09-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long m=sc.nextInt();
		long n=sc.nextInt();
		long nwh=(n*(n+1))/2;
		long nsum=power(nwh,2);
		long mwh=((m-1)*m)/2;
		long msum=power(mwh,2);
		System.out.println(nsum-msum);
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
