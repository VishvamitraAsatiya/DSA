import java .util.*;
public class EvenOddCount
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner( System.in );
		System.out.println("enter the value of n=");
		int n=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		for ( int i=1; i<=n; i++){
		 if( i%2==0){
		    evencount++;
		    }
		    else {
		    oddcount++;
		    }
		}
      	 System.out.println( " even sum ="+evencount);
		 
		  System.out.println( " odd sum ="+oddcount );
	}
}
