import java.util.*;
public class PositiveNegativeZero
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		if (n>0)
		{System.out.print("this is positive");}
    	if  (n<0)
		{System.out.print("this is negative");}
    	if (n==0){
	    System.out.print("zero");
	}
  }
}