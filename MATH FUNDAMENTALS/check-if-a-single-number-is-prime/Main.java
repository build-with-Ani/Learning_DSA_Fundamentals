/*
TOPIC: Math/Number Theory
PATTERN: Prime Check
PROBLEM: Check if a single number is prime
AUTHOR: Anisha
DATE: 05-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isprime(n)){
		    System.out.println("prime");
		}else{
		    System.out.println("not prime");
		}
	}
	public static boolean isprime(int n){
	    if(n<=1) return false;
	    if(n==2 || n==3) return true;
	    if(n%2==0)return false;
	    for(int i=3;i*i<=n;i=i+2){
	        if(n%i==0) return false;
	    }
	    return true;
	}
}