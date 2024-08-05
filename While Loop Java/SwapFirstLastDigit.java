import java.util.*;
public class SwapFirstLastDigit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int l=n%10;
		int temp = n;
		int c=0;
		int f=0;
		while(n>0){
		    f=n%10;
		    c++;
		    n=n/10;
		}
		n=temp;
		n=n/10;
		n=n*10+f;
		n=n%(int)Math.pow(10,c-1);
		n=l*(int)Math.pow(10,c-1)+n;
		System.out.println("Number after swapping: "+n);
	}
}