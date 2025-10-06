/*
TOPIC: Math/Number Theory
PATTERN: Modular Arithmetic (add, sub, mul under mod)
PROBLEM: add, sub, mul under mod
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
		int mod=1000000007;
		int add=(a+b)%mod;
		int sub=(a-b+mod)%mod;
		int mul=(a*b)%mod;
		System.out.println(add+" "+sub+" "+mul);
	}
}
