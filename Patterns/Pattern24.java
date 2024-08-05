import java.util.*;
public class Pattern24
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int star=a;
	    int space=-1;
	    for(int i=1;i<=a;i++){
	       
	        for(int k=1;k<=star;k++){
                System.out.print(" *");  
	        }
	         for(int j=1;j<=space;j++){
	            System.out.print("  ");
	        }
    	                   
	                   System.out.println();
	                   star--;
	                   space++;
	       
	     }
	     
	     star=1;
	     space=a-1;
	      for(int i=2;i<=a;i++){
	       
	        for(int k=1;k<=star;k++){ 
	            System.out.print(" *");  
	        }
	         for(int j=1;j<=space;j++){
	            System.out.print("  ");
	            
	        }
	           
	                   
	       
	       	                   
	                   System.out.println();
	                   star++; 
	                   space--;
	                   
	                   
	           
	       
	            
	        

	     }
	     
	     
	    }
	}