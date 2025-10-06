/*
TOPIC: Math/Number Theory
PATTERN: GCD / LCM (Euclidean Algorithm)
PROBLEM: Find the GCD of N numbers stored in an array.
AUTHOR: Anisha
DATE: 06-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int i=0;i<size;i++){
		    arr[i]=sc.nextInt();
		}
		int gcd=arr[0];
		for(int i=1;i<size;i++){
		    gcd=gcd(gcd,arr[i]);
		}
		System.out.println(gcd);
	}
	public static int gcd(int a,int b){
	    if(b==0) return a;
	    else return gcd(b,a%b);
	}
}
