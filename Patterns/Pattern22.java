import java.util.*;
public class Pattern22
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int star=1;
	    int space=a-1;
	    for(int i=1;i<=a;i++){
	        for(int j=1;j<=space;j++){
	            System.out.print("  ");
	        }
	        for(int k=1;k<=star;k++){
	            if(k==1||k==star){
	            System.out.print(" *");
	            }else{
	                System.out.print("  ");
	            }
	        }
	                   System.out.println();
	                   star++;
	                   space--;
	     }
	     a--;
	     star=a;
	     space=1;
	      for(int i=1;i<=a;i++){
	        for(int j=1;j<=space;j++){
	            System.out.print("  ");
	            
	        }
	        for(int k=1;k<=star;k++){ 
	            if(k==1||k==star){
	              System.out.print(" *");  
	            }else{
	                System.out.print("  ");
	            }
	        }
	                   System.out.println();
	                   star--; 
	                   space++;
	      }
	}
}
