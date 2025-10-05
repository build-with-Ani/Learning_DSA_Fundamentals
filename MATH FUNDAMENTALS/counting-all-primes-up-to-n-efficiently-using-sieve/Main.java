/*
TOPIC: Math/Number Theory
PATTERN: Sieve of Eratosthenes (leetcode 204)
PROBLEM: Counting all primes up to N efficiently.
AUTHOR: Anisha
DATE: 05-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] isprime=new boolean[n+1];
		for(int i=0;i<isprime.length;i++){
		    isprime[i]=true;
		}
		isprime[0]=isprime[1]=false;
		for(int i=2;i*i<=n;i++){
		    if(isprime[i]){
		        for(int j=i*i;j<=n;j=j+i){
		            isprime[j]=false;
		        }
		    }
		}
		int count=0;
		for(int i=0;i<n;i++){
		    if(isprime[i]){
		        count++;
		    }
		}
		System.out.println(count);
	}
}
