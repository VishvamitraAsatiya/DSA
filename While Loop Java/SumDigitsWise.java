import java .util.*;
public class SumDigitsWise 
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner( System.in );
		System.out.println("enter the value of a=");
		int a=sc.nextInt();
			System.out.println("enter the value of b=");
		int b=sc.nextInt();
		
		int p=1;
     	int	n=0;   
		int carry=0;
		while(a>0 && b>0){
		     int x=a%10;
		     int y=b%10;
		     int z=x+y+carry;
		     n=(z%10)*p+n;
		     carry=z/10;
		     a=a/10;
		     b=b/10;
		     p=p*10;
		}
		n= (a+b+carry)*p+n;
		     
		     
	
		 	System.out.println("sum of ab= " +n);    
		     
		     
	}
}
		     
		     
		     
		     
		     
		     
		     
		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
