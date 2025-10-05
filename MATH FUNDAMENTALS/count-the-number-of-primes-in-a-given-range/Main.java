/*
TOPIC: Math/Number Theory
PATTERN: Prime Check
PROBLEM: count the number of primes in a given range
AUTHOR: Anisha
DATE: 05-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int count=0;
		for(int i=n1;i<=n2;i++){
		    if(isprime(i)){
		        count++;
		    }
		}
		System.out.println(count);
	}
	public static boolean isprime(int n){
	    if(n<=1) return false;
	    if(n==2 || n==3) return true;
	    if(n%2==0) return false;
	    for(int i=3;i*i<=n;i=i+2){
	        if(n%i==0) return false;
	    }
	    return true;
	}
}
