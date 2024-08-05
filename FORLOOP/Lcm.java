import java.util.*;
public class Lcm
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	     System.out.print("Enter the first number: ");
	    int a=sc.nextInt();
	     System.out.print("Enter the second number: ");
	    int b=sc.nextInt();
	    for(int i=1;i<=a*b;i++){
	        if(i%a==0&&i%b==0){
	            System.out.println(i);
	            break;
	        }
	        
	    }
		
	}
}
