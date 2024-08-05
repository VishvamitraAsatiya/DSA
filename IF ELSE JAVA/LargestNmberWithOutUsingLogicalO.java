import java.util.*;
public class LargestNmberWithUsingLogicalO{
		public static void main(String[] args){
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter 1st Number: ");
				int a = sc.nextInt();
				System.out.print("Enter 2nd Number: ");
				int b = sc.nextInt();
				System.out.print("Enter 3rd Number: ");
				int c = sc.nextInt();
				
				if(a>b && a>c){
								System.out.println(a+" is greater");
				}
				else{
						if(b>c){System.out.println(b+" is greater");
						}
						else{
								System.out.println(c+" is greater");
						}
				}
		}
}