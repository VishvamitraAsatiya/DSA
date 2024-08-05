import java .util.*;
public class Factor
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner( System.in );
		System.out.print(" enter the Number=");
		int a=sc.nextInt(); 
		for ( int i=1; i<=a; i++)
		{ if (a%i==0)
		{ System.out.print("\n"+i);
		}
		}
	}
}