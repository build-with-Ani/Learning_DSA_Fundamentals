/*
TOPIC: Math/Number Theory
PATTERN: Pascal’s Triangle / Properties
PROBLEM: Return the nth row of Pascal's triangle
AUTHOR: Anisha
DATE: 08-10-2025
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rowindex=sc.nextInt();
		List<Long> row=pascal(rowindex);
		System.out.println(row);
	}
	public static List<Long> pascal(int rowindex){
	    List<Long> row=new ArrayList<>();
	    long val=1;
	    row.add(val);
	    for(int i=1;i<=rowindex;i++){
	        val=val*(rowindex-i+1)/i;
	        row.add(val);
	    }
	    return row;
	}
}

