import java.util.*;
public class AToBSumPrimeNumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter First mumber: ");
	    int a=sc.nextInt();
	    System.out.print("Enter Secind mumber: ");
	    int b=sc.nextInt();
	    int sum =0;
	   
	    for(;a<=b;a++){
	       int flag=0;
	       for(int i =2;i<a;i++){
	           if(a%i==0) {
	               flag =1;
	               break;
	           }
	       }
	       if(flag==0){
	           sum +=a;
	       }
	       
	    }
	    
	    System.out.print("a to b number sum prime number: "+sum);
    }		
 }