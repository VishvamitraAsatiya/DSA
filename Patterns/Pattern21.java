import java.util.*;
public class Pattern21
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int star=1;
	    for(int i=1;i<=a;i++){
        for(int j=1;j<=star;j++){
	            
	        System.out.print("* "); 
	              }
	        System.out.println();
	                   star++;
	    }
	     a--;
	     star=a;
	      for(int i=1;i<=a;i++){
	        for(int j=1;j<=star;j++){ 
	           
	            System.out.print("* "); 
	            }
	              System.out.println();
	              star--; 
	      }
	     
	    }
	}