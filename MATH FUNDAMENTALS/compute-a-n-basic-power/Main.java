/*
TOPIC: Math/Number Theory
PATTERN: Logarithms / Exponents / Power Checks
PROBLEM: Compute a^n (basic power)
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=sc.nextInt();
		int pow=power(a,n);
		System.out.print(pow);
	}
	public static int power(int a,int n){
	    int pow=1;
	    if(n==0){
	        return pow;
	    }else{
    	    for(int i=1;i<=n;i++){
    	        pow=pow*a;
    	    }
    	    return pow;
	    }
	}
}
