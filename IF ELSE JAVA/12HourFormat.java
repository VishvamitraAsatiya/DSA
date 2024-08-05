import java.util.*;
public class 12HourFormat
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
		System.out.println("enter hour");
		int h=sc.nextInt();
		System.out.println("enter minute");
		int m=sc.nextInt();
		if (h<12){
	    System.out.print(h+":"+m+"am");
     	}
		else{
	    if (h>12){ 
		System.out.print(h+":"+m+"pm");
		}
		else {
		    System.out.print(h+":"+m+"pm");
	  }
	}
  }
}