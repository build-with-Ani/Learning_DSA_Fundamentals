/*
TOPIC: Math/Number Theory
PATTERN: Bitwise Operations (set/unset/count bits, XOR tricks, subset generation)
PROBLEM: Subset generation using bits
AUTHOR: Anisha
DATE: 15-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int totalsubsets=(1<<n);
		for(int mask=0;mask<totalsubsets;mask++){
		    System.out.print("{");
		    for(int j=0;j<n;j++){
		        if((mask & (1<<j)) !=0){
		            System.out.print(a[j]+" ");
		        }
		    }
		    System.out.print("}");
		}
	}
}
