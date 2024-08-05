import java .util.*; 
public class SumOfEvenDigits
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner( System.in); 
	    
	 System.out.print(" ENTER a number");
        int n =sc.nextInt();
        int sum=0;
    while(n>0){
        int r=n%10;
    if(r%2==0);{
        sum=sum+r;
         }
         n=n/10;
            }
     System.out.println("sum of even digit"+sum);



 }
}





