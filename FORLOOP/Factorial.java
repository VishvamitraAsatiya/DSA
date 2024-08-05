import java .util.*;
public class Factorial
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner( System.in );
		System.out.println("enter the value of a=");
		int n=sc.nextInt();

int fact=1;

for( int i=1 ; i<=n; ++i)
{
    fact=fact*i;
    
}
System.out .print(" factorial="+fact);



}


}
