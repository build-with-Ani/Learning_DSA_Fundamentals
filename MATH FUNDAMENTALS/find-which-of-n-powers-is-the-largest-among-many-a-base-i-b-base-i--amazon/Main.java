/*
TOPIC: Math/Number Theory
PATTERN: Logarithms / Exponents / Power Checks
PROBLEM: Find which of N powers is the largest among many (a base i)^(b base i) -Amazon 
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int N=sc.nextInt();
	    double maxlog=-1;int maxindex=0;
	    for(int i=1;i<=N;i++){
	        long a=sc.nextLong();
	        long b=sc.nextLong();
	        double ab=b*Math.log10(a);
	        if(ab>maxlog){
	            maxlog=ab;
	            maxindex=i;
	        }
	    }
	    System.out.print(maxindex);
	}
}
