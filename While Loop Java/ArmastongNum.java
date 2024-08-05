import java.util.*;
public class ArmastongNum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int temp = n;
		int c=0;
		while(n>0){
		    c++;
		    n=n/10;
		}
		n=temp;
		int rev=0;
		while(n>0){
		    int r = n%10;
		    rev = rev+(int)Math.pow(r,c);
		    n=n/10;
		}
		if(rev==temp){
		    System.out.println("Number is armstrong");
		}
		else{
		    System.out.println("Number is not armstrong");
		}
		
	}
	}