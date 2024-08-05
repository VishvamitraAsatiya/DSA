import java.util.*;
public class Pattern18
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int star=a;
	    int space=-1;
	    for(int i=1;i<=a;i++){
	        for(int j=1;j<=star;j++){ 
	            System.out.print("* "); 
	            
	        }
	                   
	       for(int k=1;k<=space;k++){
	          
	         System.out.print("  ");
	           
	       }
	       for(int j=1;j<=star&&j!=a;j++){
	           System.out.print("* ");
	       }
	         
	                   System.out.println();
	                   star--;
	                   space+=2;
	    }
	       star=2;
	     space=2*a-5;
	    for(int i=2;i<=a;i++){
	        for(int j=1;j<=star;j++){ 
	            System.out.print("* "); 
	            
	        }
	                   
	       for(int k=1;k<=space;k++){
	          
	         System.out.print("  ");
	           
	       }
	       for(int j=1;j<=star&&j!=a;j++){
	           System.out.print("* ");
	       }

	                   System.out.println();
	                   star++;
	                   space-=2;
	    }
	}
}