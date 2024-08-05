import java.util.*;
public class AmToPm
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
		System.out.println("enter the hour");
		int h=sc.nextInt();
		System.out.println("enter minute");
		int m=sc.nextInt();
		if (h<12){
		System.out.print(h+":"+m+"am");
		    
		}
		else {
		    if (h>12){
		    System.out.print((h-12)+":"+m+"pm");
		    
		}
		else  {
		    System.out.print(h+":"+m+"pm");
	 }
	}
  }
}
