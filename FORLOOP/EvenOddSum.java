import java .util.*;
public class EvenOddSum
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner( System.in );
		System.out.println("enter the value of n=");
		int n=sc.nextInt();
		int evensum=0;
		int oddsum=0;
		for ( int i=1; i<=n; i++){
		 if( i%2==0){
		    evensum=evensum+i;
		    }
		    else {
		    oddsum=oddsum+i;
		    }
		}
      	 System.out.println( " even sum ="+evensum);
		 
		  System.out.println( " odd sum ="+oddsum);
	}
}
