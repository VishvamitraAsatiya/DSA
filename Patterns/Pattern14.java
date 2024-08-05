import java.util.*;
public class Pattern14
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int star=a*2-1;
	    int space=0;
	    for(int i=1;i<=a;i++){
	        for(int j=1;j<=space;j++){ 
	            System.out.print("  "); }
	                   
	       for(int k=1;k<=star;k++){
	            System.out.print("* ");
	       } 
	                   System.out.println();
	                   star-=2;
	                   space++;
	    }
	}
}