/*
TOPIC: Math/Number Theory
PATTERN: GCD / LCM (Euclidean Algorithm)
PROBLEM: Find the LCM of two numbers (a, b)
AUTHOR: Anisha
DATE: 06-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int mul=a*b;
		int gcd=gcd(a,b);
		int lcm=mul/gcd;
		System.out.println(lcm);
	}
	public static int gcd(int a,int b){
	    while(b!=0){
	        int temp=b;
	        b=a%b;
	        a=temp;
	    }
	    return a;
	}
}
