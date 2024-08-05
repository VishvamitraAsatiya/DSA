import java .util.*; 
public class CountDigits
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner( System.in); 
	    
	    System.out.print(" ENTER a number=");
        int n =sc.nextInt();
      int count=0;
       
        while( n>0)
        { count++;
         
         n=n/10;}
         {
              System.out.print(" no of digits=" +count);
            
         }
    }
    
}