import java.util.*;
public class AToBStrongNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int x = sc.nextInt();
	    System.out.print("Enter a Number: ");
	    int y = sc.nextInt();
	   
	   for(; x<=y;x++){
	        int b = x;
	        int sum = 0;
	   
	        for( ;b>0; b/=10){
	              int n = b%10;
	              int ans = 1;
	    
	              for(int a=1 ; a<=n ; a++){
	                     ans *= a;
	              }
	              sum +=ans;
        	}
        	if(x==sum) System.out.println(x);
        	    
        	
        	
	   }
	}
}