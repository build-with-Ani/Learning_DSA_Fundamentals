/*
TOPIC: Math/Number Theory
PATTERN: Pascal’s Triangle / Properties
PROBLEM: Generate Pascal's Triangle (n rows)
AUTHOR: Anisha
DATE: 08-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> prev=new ArrayList<>();
		for(int row=0;row<n;row++){
		    List<Integer> curr=new ArrayList<>();
		    for(int col=0;col<=row;col++){
		        if(col==0 || row==col){
		            curr.add(1);
		        }else{
		            curr.add(prev.get(col-1)+prev.get(col));
		        }
		    }
		    for(int val:curr) System.out.print(val+" ");
	        System.out.println();
	        prev=curr;
		}
	}
}
